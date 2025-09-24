package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Lesson;

import java.util.List;
import java.util.UUID;

public interface LessonService {
    Lesson saveLesson(Lesson lesson, UUID courseId);
    List<Lesson> getAllLessons();
    Lesson getLesson(UUID id);
    Lesson updatLesson(UUID id, Lesson lesson);
    void removeLesson(UUID id);
}
