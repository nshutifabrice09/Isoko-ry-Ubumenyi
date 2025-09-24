package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public Lesson saveLesson(Lesson lesson, UUID courseId) {
        return null;
    }

    @Override
    public List<Lesson> getAllLessons() {
        return null;
    }

    @Override
    public Lesson getLesson(UUID id) {
        return null;
    }

    @Override
    public Lesson updatLesson(UUID id, Lesson lesson) {
        return null;
    }

    @Override
    public void removeLesson(UUID id) {

    }
}
