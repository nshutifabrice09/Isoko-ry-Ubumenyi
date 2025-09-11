package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Question;

import java.util.List;

public interface QuestionService {
    Question saveQuestion(Question question, Long quizId);
    List <Question> getAllQuestion();
    Question getQuestion(Long UUID);
    Question updateQuestion(Long UUID, Question question);
    void removeQuestion(Long UUID);
}
