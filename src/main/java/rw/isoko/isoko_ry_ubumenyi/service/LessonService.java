package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Lesson;

import java.util.List;
import java.util.UUID;

public interface LessonService {
    Lesson saveLesson(Lesson lesson, UUID courseId);
    List<Lesson> getAllLessons();
    Lesson getLesson(Long UUID);
    Lesson updatLesson(Long UUID, Lesson lesson);
    void removeLesson(Long UUID);
}
