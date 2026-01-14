package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Question;
import rw.isoko.isoko_ry_ubumenyi.service.QuestionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/question")
@CrossOrigin("http://localhost:3000")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/{quizId}")
    public Question saveQuestion(@RequestBody Question question, @PathVariable ("quizId")UUID quizId){
        return questionService.saveQuestion(question, quizId);
    }

    @GetMapping("/list")
    public List<Question> questionList(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable ("id") UUID id){
        return questionService.getQuestion(id);
    }

    @PutMapping("/update/{id}")
    public Question updateQuestion(@PathVariable ("id") UUID id, @RequestBody Question question){
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteQuestion(@PathVariable ("id") UUID id){
        questionService.removeQuestion(id);
    }
}
