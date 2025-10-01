package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Submission;
import rw.isoko.isoko_ry_ubumenyi.service.SubmissionService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class SubmissionController {

    private final SubmissionService submissionService;

    @Autowired
    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping("/submission/{studentId}/{assignmentId}")
    public Submission saveSubmission(@RequestBody Submission submission,
                                     @PathVariable ("studentId")UUID studentId,
                                     @PathVariable ("assignmentId") UUID assignmentId){
        return submissionService.saveSubmission(submission, studentId, assignmentId);
    }

    @GetMapping("/submissions")
    public List<Submission> submissionList(){
        return submissionService.getAllSubmissions();
    }

    @GetMapping("/submission/{id}")
    public Submission getSubmission(@PathVariable ("id") UUID id){
        return submissionService.getSubmission(id);
    }

    @PutMapping("/update/submission/{id}")
    public Submission updateSubmission(@PathVariable ("id") UUID id, @RequestBody Submission submission){
        return submissionService.updateSubmission(id, submission);
    }

    @DeleteMapping("/delete/submission/{id}")
    public void deleteSubmission(@PathVariable ("id") UUID id){
        submissionService.remove(id);
    }

}
