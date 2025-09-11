package rw.isoko.isoko_ry_ubumenyi.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "enrollments", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "course_id"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long UUID;

    @ManyToOne
    private User user;

    @ManyToOne
    private Course course;

    private Double progress = 0.0; // percentage
}
