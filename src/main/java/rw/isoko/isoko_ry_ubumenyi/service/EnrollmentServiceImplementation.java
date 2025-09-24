package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
import rw.isoko.isoko_ry_ubumenyi.model.Enrollment;
import rw.isoko.isoko_ry_ubumenyi.model.User;
import rw.isoko.isoko_ry_ubumenyi.repository.CourseRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.EnrollmentRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class EnrollmentServiceImplementation implements EnrollmentService{

    private final EnrollmentRepository enrollmentRepository;
    private final UserRepository userRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public EnrollmentServiceImplementation(EnrollmentRepository enrollmentRepository, UserRepository userRepository, CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.userRepository = userRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment, UUID userId, UUID courseId) {
        User user = userRepository.findUserById(userId);
        Course course = courseRepository.findCourseById(courseId);
        enrollment.setUser(user);
        enrollment.setCourse(course);
        return enrollmentRepository.save(enrollment );
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getEnrollment(UUID id) {
        return enrollmentRepository.findEnrollmentById(id);
    }

    @Override
    public Enrollment updateEnrollment(UUID id, Enrollment enrollment) {
        Enrollment existEnrollment = enrollmentRepository.findEnrollmentById(id);
        if(existEnrollment != null){
            existEnrollment.setProgress(enrollment.getProgress());
            return enrollmentRepository.save(existEnrollment);
        }
        return null;
    }

    @Override
    public void remove(UUID id) {
        enrollmentRepository.deleteById(id);
    }
}
