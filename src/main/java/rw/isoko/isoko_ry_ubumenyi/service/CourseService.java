package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Course;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    Course saveCourse (Course course, UUID instructorId);
    List <Course> getAllCourses();
    Course getCourse(Long UUID);
    Course updateCourse(Long UUID, Course course);
    void removeCourse(Long UUID);

}
