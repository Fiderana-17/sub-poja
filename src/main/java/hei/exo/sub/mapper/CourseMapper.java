package hei.exo.sub.mapper;

import hei.exo.sub.entity.CourseEntity;
import hei.exo.sub.models.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public Course toModel(CourseEntity courseEntity) {
        return new Course(
                courseEntity.getId(),
                courseEntity.getTitle(),
                courseEntity.getStart(),
                courseEntity.getEnd());
    }
}
