package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.Enrollment;
import rw.isoko.isoko_ry_ubumenyi.service.EnrollmentService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @Autowired
    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping("/enrollment/{userId}/{courseId}")
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment,
                                     @PathVariable ("userId") UUID userId, @PathVariable ("courseId") UUID courseId){
        return enrollmentService.saveEnrollment(enrollment, userId, courseId);
    }

    @GetMapping("/enrollments")
    public List<Enrollment> enrollmentList(){
        return enrollmentService.getAllEnrollments();
    }
}
