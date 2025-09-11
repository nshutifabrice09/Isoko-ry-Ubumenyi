package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse (Course course, Long instructorId);
    List <Course> getAllCourses();
    Course getCourse(Long UUID);
    Course updateCourse(Long UUID, Course course);
    void removeCourse(Long UUID);

}
