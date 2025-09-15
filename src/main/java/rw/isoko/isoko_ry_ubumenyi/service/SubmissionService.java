package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.Submission;

import java.util.List;
import java.util.UUID;

public interface SubmissionService {
    Submission saveSubmission(Submission submission, UUID studentId, UUID assignment_id);
    List<Submission> getAllSubmissions();
    Submission getSubmission(UUID id);
    Submission updateSubmission(UUID id, Submission submission);
    void remove (UUID id);
}
