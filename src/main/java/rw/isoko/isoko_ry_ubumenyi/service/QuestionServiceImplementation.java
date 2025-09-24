package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Question;
import rw.isoko.isoko_ry_ubumenyi.repository.QuestionRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.QuizRepository;

import java.util.List;
import java.util.UUID;

@Service
public class QuestionServiceImplementation implements QuestionService{
    private final QuestionRepository questionRepository;
    private final QuizRepository quizRepository;

    public QuestionServiceImplementation(QuestionRepository questionRepository, QuizRepository quizRepository) {
        this.questionRepository = questionRepository;
        this.quizRepository = quizRepository;
    }

    @Override
    public Question saveQuestion(Question question, UUID quizId) {
        return null;
    }

    @Override
    public List<Question> getAllQuestion() {
        return null;
    }

    @Override
    public Question getQuestion(UUID id) {
        return null;
    }

    @Override
    public Question updateQuestion(UUID id, Question question) {
        return null;
    }

    @Override
    public void removeQuestion(UUID id) {

    }
}
