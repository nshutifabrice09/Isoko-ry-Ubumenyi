package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
import rw.isoko.isoko_ry_ubumenyi.model.Lesson;
import rw.isoko.isoko_ry_ubumenyi.repository.CourseRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.LessonRepository;

import java.util.List;
import java.util.UUID;

@Service
public class LessonServiceImplementation implements LessonService{
     private final LessonRepository lessonRepository;
     private final CourseRepository courseRepository;

     @Autowired
    public LessonServiceImplementation(LessonRepository lessonRepository, CourseRepository courseRepository) {
        this.lessonRepository = lessonRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Lesson saveLesson(Lesson lesson, UUID courseId){
        Course course = courseRepository.findCourseById(courseId);
        lesson.setCourse(course);
        return lessonRepository.save(lesson);
    }

    @Override
    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson getLesson(UUID id) {
        return lessonRepository.findLessonById(id);
    }

    @Override
    public Lesson updatLesson(UUID id, Lesson lesson) {
         Lesson existLesson = lessonRepository.findLessonById(id);
         if(existLesson != null){
             existLesson.setTitle(lesson.getTitle());
             existLesson.setContent(lesson.getContent());
             existLesson.setFileUrl(lesson.getFileUrl());
             return lessonRepository.save(existLesson);
         }
        return null;
    }

    @Override
    public void removeLesson(UUID id) {
    lessonRepository.deleteById(id);
    }
}
