package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Lesson;

import java.util.List;

public interface LessonService {
    Lesson saveLesson(Lesson lesson, Long courseId);
    List<Lesson> getAllLessons();
    Lesson getLesson(Long UUID);
    Lesson updatLesson(Long UUID, Lesson lesson);
    void removeLesson(Long UUID);
}
