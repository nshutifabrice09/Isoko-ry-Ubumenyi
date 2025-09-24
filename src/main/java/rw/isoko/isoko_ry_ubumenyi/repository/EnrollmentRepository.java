package rw.isoko.isoko_ry_ubumenyi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.isoko.isoko_ry_ubumenyi.model.Enrollment;

import java.util.UUID;

@Repository
public interface EnrollmentRepository extends JpaRepository <Enrollment, UUID> {
    Enrollment findEnrollmentById(UUID id);
}
