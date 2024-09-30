package demo.websquare.domain.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 30, message = "Name cannot exceed 30 characters")
    private String name;
    private String email;

//    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
