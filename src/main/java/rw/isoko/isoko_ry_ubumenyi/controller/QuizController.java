package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Quiz;
import rw.isoko.isoko_ry_ubumenyi.service.QuizService;

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
}
