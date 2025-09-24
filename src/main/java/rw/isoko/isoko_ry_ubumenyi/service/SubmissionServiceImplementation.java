package rw.isoko.isoko_ry_ubumenyi.service;

import org.springframework.stereotype.Service;
import rw.isoko.isoko_ry_ubumenyi.model.Submission;

import java.util.List;
import java.util.UUID;

@Service
public class SubmissionServiceImplementation implements SubmissionService{

    @Override
    public Submission saveSubmission(Submission submission, UUID studentId, UUID assignment_id) {
        return null;
    }

    @Override
    public List<Submission> getAllSubmissions() {
        return null;
    }

    @Override
    public Submission getSubmission(UUID id) {
        return null;
    }

    @Override
    public Submission updateSubmission(UUID id, Submission submission) {
        return null;
    }

    @Override
    public void remove(UUID id) {

    }
}
