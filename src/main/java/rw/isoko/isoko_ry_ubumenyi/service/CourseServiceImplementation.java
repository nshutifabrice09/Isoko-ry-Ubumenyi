package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
import rw.isoko.isoko_ry_ubumenyi.model.User;
import rw.isoko.isoko_ry_ubumenyi.repository.CourseRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImplementation implements CourseService{

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    @Autowired
    public CourseServiceImplementation(CourseRepository courseRepository, UserRepository userRepository){
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }
    @Override
    public Course saveCourse(Course course, UUID instructorId) {
        User user = userRepository.findUserById(instructorId);
        course.setInstructor(user);
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(UUID id) {
        return courseRepository.findCourseById(id);
    }

    @Override
    public Course updateCourse(UUID id, Course course) {
        return null;
    }

    @Override
    public void removeCourse(UUID id) {

    }


}
