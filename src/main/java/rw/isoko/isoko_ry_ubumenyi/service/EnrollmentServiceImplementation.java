package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Enrollment;

import java.util.List;
import java.util.UUID;

@Service
public class EnrollmentServiceImplementation implements EnrollmentService{
    @Override
    public Enrollment saveEnrollment(Enrollment enrollment, UUID userId, UUID courseId) {
        return null;
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return null;
    }

    @Override
    public Enrollment getEnrollment(UUID id) {
        return null;
    }

    @Override
    public Enrollment updateEnrollment(UUID id, Enrollment enrollment) {
        return null;
    }

    @Override
    public void remove(UUID id) {

    }
}
