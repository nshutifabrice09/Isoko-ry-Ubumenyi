package rw.isoko.isoko_ry_ubumenyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.isoko.isoko_ry_ubumenyi.model.Lesson;

import java.util.UUID;

@Repository
public interface LessonRepository extends JpaRepository <Lesson, UUID> {
    Lesson findLessonById(UUID id);
}
