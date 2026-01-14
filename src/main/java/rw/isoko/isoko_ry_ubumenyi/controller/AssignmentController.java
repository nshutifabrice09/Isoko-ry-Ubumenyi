package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Assignment;
import rw.isoko.isoko_ry_ubumenyi.service.AssignmentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/assignment")
@CrossOrigin("http://localhost:3000")
public class AssignmentController {

    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping("/{courseId}")
    public Assignment saveAssignment(@RequestBody Assignment assignment, @PathVariable ("courseId") UUID courseId){
        return assignmentService.saveAssignment(assignment, courseId);
    }

    @GetMapping("/list")
    public List<Assignment> assignmentList(){
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/{id}")
    public Assignment getAssignment(@PathVariable ("id") UUID id){
        return assignmentService.getAssignment(id);
    }

    @PutMapping("/update/{id}")
    public Assignment updateAssignment(@PathVariable ("id") UUID id, @RequestBody Assignment assignment){
        return assignmentService.updateAssignment(id, assignment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable ("id") UUID id){
        assignmentService.remove(id);
    }
}
