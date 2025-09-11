package rw.isoko.isoko_ry_ubumenyi.dto.request;

import jakarta.validation.constraints.NotBlank;

public class CourseRequest {
    @NotBlank
    private String title;
    private String description;
    private Long instructorId;
}
