package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Question;
import rw.isoko.isoko_ry_ubumenyi.model.Quiz;
import rw.isoko.isoko_ry_ubumenyi.repository.QuestionRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.QuizRepository;

import java.util.List;
import java.util.UUID;

@Service
public class QuestionServiceImplementation implements QuestionService{
    private final QuestionRepository questionRepository;
    private final QuizRepository quizRepository;

    @Autowired
    public QuestionServiceImplementation(QuestionRepository questionRepository, QuizRepository quizRepository) {
        this.questionRepository = questionRepository;
        this.quizRepository = quizRepository;
    }

    @Override
    public Question saveQuestion(Question question, UUID quizId) {
        Quiz quiz = quizRepository.findQuizById(quizId);
        question.setQuiz(quiz);
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestion(UUID id) {
        return questionRepository.findQuestionById(id);
    }

    @Override
    public Question updateQuestion(UUID id, Question question) {
        Question existQuestion = questionRepository.findQuestionById(id);
        if(existQuestion != null){
            existQuestion.setText(question.getText());
            existQuestion.setType(question.getType());
            existQuestion.setCorrectAnswer(question.getCorrectAnswer());
            return questionRepository.save(existQuestion);
        }
        return null;
    }

    @Override
    public void removeQuestion(UUID id) {
        questionRepository.deleteById(id);
    }
}
