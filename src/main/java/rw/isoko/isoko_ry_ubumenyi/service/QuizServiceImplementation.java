package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
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
        Course course = courseRepository.findCourseById(courseId);
        quiz.setCourse(course);
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuiz(UUID id) {
        return quizRepository.findQuizById(id);
    }

    @Override
    public Quiz updateQuiz(UUID id, Quiz quiz) {
        Quiz existQuiz = quizRepository.findQuizById(id);
        if(existQuiz != null){
            existQuiz.setTitle(quiz.getTitle());
            return quizRepository.save(existQuiz);
        }
        return null;
    }

    @Override
    public void removeQuiz(UUID id) {
        quizRepository.deleteById(id);
    }
}
