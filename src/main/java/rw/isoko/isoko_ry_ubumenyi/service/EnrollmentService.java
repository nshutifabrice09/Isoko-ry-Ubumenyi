package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Enrollment;

import java.util.List;
import java.util.UUID;

public interface EnrollmentService {
    Enrollment saveEnrollment(Enrollment enrollment, UUID userId, UUID courseId);
    List<Enrollment> getAllEnrollments();
    Enrollment getEnrollment(UUID id);
    Enrollment updateEnrollment(UUID id, Enrollment enrollment);
    void remove (UUID id);
}
