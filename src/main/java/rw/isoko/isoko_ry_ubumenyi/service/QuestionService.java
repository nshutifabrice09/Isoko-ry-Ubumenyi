package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Question;

import java.util.List;
import java.util.UUID;

public interface QuestionService {
    Question saveQuestion(Question question, UUID quizId);
    List <Question> getAllQuestion();
    Question getQuestion(UUID id);
    Question updateQuestion(UUID id, Question question);
    void removeQuestion(UUID id);
}
