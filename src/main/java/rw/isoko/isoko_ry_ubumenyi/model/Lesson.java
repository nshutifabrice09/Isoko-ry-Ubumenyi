package rw.isoko.isoko_ry_ubumenyi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "lessons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Lesson title is required")
    private String title;

    private String content;

    private String fileUrl;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}