package hei.exo.sub.mapper;

import hei.exo.sub.dto.response.CourseResponse;
import hei.exo.sub.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CourseMapper {

    private final UserMapper userMapper;

    public CourseResponse toResponse(Course course) {
        return new CourseResponse(
                course.getId(),
                course.getTitle(),
                course.getStart(),
                course.getEnd(),
                course.getSubscribers().stream()
                        .map(userMapper::toResponse)
                        .toList());
    }
}