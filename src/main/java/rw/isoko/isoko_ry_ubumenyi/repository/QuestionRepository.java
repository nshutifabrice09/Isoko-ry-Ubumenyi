package rw.isoko.isoko_ry_ubumenyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.isoko.isoko_ry_ubumenyi.model.Question;

import java.util.UUID;

@Repository
public interface QuestionRepository extends JpaRepository <Question, UUID> {
}
