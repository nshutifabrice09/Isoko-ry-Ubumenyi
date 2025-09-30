package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Assignment;
import rw.isoko.isoko_ry_ubumenyi.service.AssignmentService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class AssignmentController {

    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping("/assignment/{courseId}")
    public Assignment saveAssignment(@RequestBody Assignment assignment, @PathVariable ("courseId") UUID courseId){
        return assignmentService.saveAssignment(assignment, courseId);
    }

    @GetMapping("/assignments")
    public List<Assignment> assignmentList(){
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/assignment/{id}")
    public Assignment getAssignment(@PathVariable ("id") UUID id){
        return assignmentService.getAssignment(id);
    }

    @PutMapping("/update/assignment/{id}")
    public Assignment updateAssignment(@PathVariable ("id") UUID id, @RequestBody Assignment assignment){
        return assignmentService.updateAssignment(id, assignment);
    }

    @DeleteMapping("/delete/assignment/{id}")
    public void deleteCourse(@PathVariable ("id") UUID id){
        assignmentService.remove(id);
    }
}
