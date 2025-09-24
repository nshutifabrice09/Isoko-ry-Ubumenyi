package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Assignment;

import java.util.List;
import java.util.UUID;

@Service
public class AssignmentServiceImplementation implements AssignmentService{
    @Override
    public Assignment saveAssignment(Assignment assignment, UUID courseId) {
        return null;
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return null;
    }

    @Override
    public Assignment getAssignment(UUID id) {
        return null;
    }

    @Override
    public Assignment updateAssignment(UUID id, Assignment assignment) {
        return null;
    }

    @Override
    public void remove(UUID id) {

    }
}
