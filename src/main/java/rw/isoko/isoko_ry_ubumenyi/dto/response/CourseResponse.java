package rw.isoko.isoko_ry_ubumenyi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponse {
    private UUID id;
    private String title;
    private String description;
    private String instructorName;
    private LocalDateTime createdAt;
}
