package rw.isoko.isoko_ry_ubumenyi.dto.request;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    private UUID id;
    private String fullName;
    private String email;
    private String role;
}
