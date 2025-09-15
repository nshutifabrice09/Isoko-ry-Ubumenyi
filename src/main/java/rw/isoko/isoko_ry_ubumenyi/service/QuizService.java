package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Quiz;

import java.util.List;
import java.util.UUID;

public interface QuizService {
    Quiz saveQuiz(Quiz quiz, UUID courseId);
    List<Quiz> getAllQuizzes();
    Quiz getQuiz(Long UUID);
    Quiz updateQuiz(Long UUID, Quiz quiz);
    void removeQuiz(Long UUID);
}
