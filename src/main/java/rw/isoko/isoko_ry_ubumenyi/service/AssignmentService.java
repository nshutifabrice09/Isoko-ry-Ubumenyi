package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Assignment;

import java.util.List;
import java.util.UUID;

public interface AssignmentService {
    Assignment saveAssignment(Assignment assignment, UUID courseId);
    List<Assignment> getAllAssignments();
    Assignment getAssignment(UUID id);
    Assignment updateAssignment(UUID id, Assignment assignment);
    void remove (UUID id);

}
