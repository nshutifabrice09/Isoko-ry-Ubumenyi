package rw.isoko.isoko_ry_ubumenyi.dto.response;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private UUID id;
    private String fullName;
    private String email;
    private String password;
    private String role;
}
