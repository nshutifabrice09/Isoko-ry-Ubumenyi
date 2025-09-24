package rw.isoko.isoko_ry_ubumenyi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "questions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Question text is required")
    private String text;

    @Enumerated(EnumType.STRING)
    private QuestionType type;

    @ElementCollection
    private List<String> options;

    private String correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}