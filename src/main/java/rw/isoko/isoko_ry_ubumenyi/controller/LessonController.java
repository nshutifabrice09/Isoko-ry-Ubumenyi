package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Lesson;
import rw.isoko.isoko_ry_ubumenyi.service.LessonService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class LessonController {

    private final LessonService lessonService;

    @Autowired
    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping("/lesson/{courseId}")
    public Lesson save(@RequestBody Lesson lesson, @PathVariable ("courseId") UUID courseId){
        return lessonService.saveLesson(lesson, courseId);
    }

    @GetMapping("/lessons")
    public List<Lesson> lessonList(){
        return lessonService.getAllLessons();
    }

    @DeleteMapping("/delete/lesson/{id}")
    public void deleteLesson(@PathVariable ("id") UUID id){
        lessonService.removeLesson(id);
    }
}
