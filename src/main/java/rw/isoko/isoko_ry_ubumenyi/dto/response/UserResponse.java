package rw.isoko.isoko_ry_ubumenyi.dto.response;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private String fullName;
    private String email;
    private String password;
    private String role;
}
