package rw.isoko.isoko_ry_ubumenyi.dto.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    private Long UUID;
    private String fullName;
    private String email;
    private String role;
}
