package rw.isoko.isoko_ry_ubumenyi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "assignments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


}