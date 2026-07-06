package hei.exo.sub.service;

import hei.exo.sub.dto.response.CourseResponse;
import hei.exo.sub.exception.ConflictException;
import hei.exo.sub.exception.NotFoundException;
import hei.exo.sub.mapper.CourseMapper;
import hei.exo.sub.model.Course;
import hei.exo.sub.model.User;
import hei.exo.sub.repository.CourseRepository;
import hei.exo.sub.repository.UserRepository;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CourseService {

  private final CourseRepository courseRepository;
  private final UserRepository userRepository;
  private final CourseMapper courseMapper;
  private final CourseSubscriptionMailService courseSubscriptionMailService;

  @Transactional
  public CourseResponse subscribe(UUID courseId, UUID userId) {
    Course course =
        courseRepository
            .findById(courseId)
            .orElseThrow(() -> new NotFoundException("Course not found"));

    User user =
        userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found"));

    boolean alreadySubscribed =
        course.getSubscribers().stream().anyMatch(subscriber -> subscriber.getId().equals(userId));

    if (alreadySubscribed) {
      throw new ConflictException("User already subscribed to this course");
    }

    course.getSubscribers().add(user);

    Course savedCourse = courseRepository.save(course);

    courseSubscriptionMailService.sendConfirmation(user, savedCourse);

    return courseMapper.toResponse(savedCourse);
  }
}
