package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Assignment;
import rw.isoko.isoko_ry_ubumenyi.model.Submission;
import rw.isoko.isoko_ry_ubumenyi.model.User;
import rw.isoko.isoko_ry_ubumenyi.repository.AssignmentRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.SubmissionRepository;
import rw.isoko.isoko_ry_ubumenyi.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class SubmissionServiceImplementation implements SubmissionService{
    private final SubmissionRepository submissionRepository;
    private final UserRepository userRepository;
    private final AssignmentRepository assignmentRepository;

    @Autowired
    public SubmissionServiceImplementation(SubmissionRepository submissionRepository, UserRepository userRepository, AssignmentRepository assignmentRepository) {
        this.submissionRepository = submissionRepository;
        this.userRepository = userRepository;
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public Submission saveSubmission(Submission submission, UUID studentId, UUID assignment_id) {
        User user = userRepository.findUserById(studentId);
        Assignment assignment = assignmentRepository.findAssignmentById(assignment_id);
        submission.setStudent(user);
        submission.setAssignment(assignment);
        return submissionRepository.save(submission);
    }

    @Override
    public List<Submission> getAllSubmissions() {
        return submissionRepository.findAll();
    }

    @Override
    public Submission getSubmission(UUID id) {
        return submissionRepository.findSubmissionById(id);
    }

    @Override
    public Submission updateSubmission(UUID id, Submission submission) {
        Submission existSubmission = submissionRepository.findSubmissionById(id);
        if(existSubmission !=null){
            existSubmission.setFileUrl(submission.getFileUrl());
            existSubmission.setGrade(submission.getGrade());
            existSubmission.setSubmittedAt(submission.getSubmittedAt());
            return submissionRepository.save(existSubmission);
        }
        return null;
    }

    @Override
    public void remove(UUID id) {
        submissionRepository.deleteById(id);
    }
}
