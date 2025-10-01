package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Quiz;
import rw.isoko.isoko_ry_ubumenyi.service.QuizService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class QuizController {

    private final QuizService quizService;


    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/quiz/{courseId}")
    public Quiz saveQuiz(@RequestBody Quiz quiz, @PathVariable ("courseId")UUID courseId){
        return quizService.saveQuiz(quiz, courseId);
    }

    @GetMapping("/quizzes")
    public List<Quiz> quizList(){
        return quizService.getAllQuizzes();
    }

    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable("id") UUID id){
        return quizService.getQuiz(id);
    }

    @PutMapping("/update/quiz/{id}")
    public Quiz updateQuiz(@PathVariable("id") UUID id, @RequestBody Quiz quiz){
        return quizService.updateQuiz(id, quiz);
    }

    @DeleteMapping("/delete/quiz/{id}")
    public void deleteQuiz(@PathVariable ("id") UUID id){
        quizService.removeQuiz(id);
    }
}
