package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Question;
import rw.isoko.isoko_ry_ubumenyi.service.QuestionService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/question/{quizId}")
    public Question saveQuestion(@RequestBody Question question, @PathVariable ("quizId")UUID quizId){
        return questionService.saveQuestion(question, quizId);
    }

    @GetMapping("/questions")
    public List<Question> questionList(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable ("id") UUID id){
        return questionService.getQuestion(id);
    }

    @PutMapping("/update/question/{id}")
    public Question updateQuestion(@PathVariable ("id") UUID id, @RequestBody Question question){
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/delete/question/{id}")
    public void deleteQuestion(@PathVariable ("id") UUID id){
        questionService.removeQuestion(id);
    }
}
