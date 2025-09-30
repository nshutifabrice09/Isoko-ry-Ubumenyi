package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
import rw.isoko.isoko_ry_ubumenyi.service.CourseService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course/{instructorId}")
    public Course saveCourse(@RequestBody Course course, @PathVariable ("instructorId") UUID instructorId){
        return courseService.saveCourse(course, instructorId);
    }

    @GetMapping("/courses")
    public List<Course> courseList(){
        return courseService.getAllCourses();
    }


    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable ("id") UUID id){
        return courseService.getCourse(id);
    }

    @PutMapping("/update/course/{id}")
    public Course updateCourse(@PathVariable ("id") UUID id, @RequestBody Course course){
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/delete/course/{id}")
    public void deleteCourse(@PathVariable ("id") UUID id){
        courseService.removeCourse(id);
    }
}
