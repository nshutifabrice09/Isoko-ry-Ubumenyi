package rw.isoko.isoko_ry_ubumenyi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "submissions", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id", "assignment_id"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    private String fileUrl;

    private Double grade;

    private LocalDateTime submittedAt = LocalDateTime.now();
}