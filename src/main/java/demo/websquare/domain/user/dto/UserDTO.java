package demo.websquare.domain.user.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotEmpty(message = "Name is required")
    @NotNull(message = "Name is not null")
    @Size(max = 30, message = "Name cannot exceed 30 characters")
    private String name;

    @NotEmpty(message = "Email is required")
    @NotNull(message = "Email is not null")
    private String email;

    @Min(value = 18, message = "Age must be at least 18")
    @NotNull(message = "Age is not null")
    private int age;
}
