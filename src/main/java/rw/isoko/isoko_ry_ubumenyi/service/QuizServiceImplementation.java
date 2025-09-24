package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Quiz;
import rw.isoko.isoko_ry_ubumenyi.repository.CourseRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.QuizRepository;

import java.util.List;
import java.util.UUID;

@Service
public class QuizServiceImplementation implements QuizService{
    private final QuizRepository quizRepository;
    private final CourseRepository courseRepository;

    public QuizServiceImplementation(QuizRepository quizRepository, CourseRepository courseRepository) {
        this.quizRepository = quizRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Quiz saveQuiz(Quiz quiz, UUID courseId) {
        return null;
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return null;
    }

    @Override
    public Quiz getQuiz(UUID id) {
        return null;
    }

    @Override
    public Quiz updateQuiz(UUID id, Quiz quiz) {
        return null;
    }

    @Override
    public void removeQuiz(UUID id) {

    }
}
