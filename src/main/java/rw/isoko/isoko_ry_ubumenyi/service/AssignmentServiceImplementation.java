package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Assignment;
import rw.isoko.isoko_ry_ubumenyi.model.Course;
import rw.isoko.isoko_ry_ubumenyi.repository.AssignmentRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.CourseRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AssignmentServiceImplementation implements AssignmentService{

    private final AssignmentRepository assignmentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public AssignmentServiceImplementation(AssignmentRepository assignmentRepository, CourseRepository courseRepository) {
        this.assignmentRepository = assignmentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Assignment saveAssignment(Assignment assignment, UUID courseId) {
        Course course = courseRepository.findCourseById(courseId);
        assignment.setCourse(course);
        return assignmentRepository.save(assignment);
    }

    @Override
    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    @Override
    public Assignment getAssignment(UUID id) {
        return assignmentRepository.findAssignmentById(id);
    }

    @Override
    public Assignment updateAssignment(UUID id, Assignment assignment) {
        Assignment existAssignment = assignmentRepository.findAssignmentById(id);
        if(existAssignment != null){
            existAssignment.setTitle(assignment.getTitle());
            existAssignment.setDescription(assignment.getDescription());
            existAssignment.setDueDate(assignment.getDueDate());
            return assignmentRepository.save(existAssignment);
        }
        return null;
    }

    @Override
    public void remove(UUID id) {
        assignmentRepository.deleteById(id);
    }
}
