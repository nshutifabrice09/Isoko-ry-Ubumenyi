package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Course;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImplementation implements CourseService{
    @Override
    public Course saveCourse(Course course, UUID instructorId) {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return null;
    }

    @Override
    public Course getCourse(UUID id) {
        return null;
    }

    @Override
    public Course updateCourse(UUID id, Course course) {
        return null;
    }

    @Override
    public void removeCourse(UUID id) {

    }
}
