package com.example.common.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Display name cannot be empty")
    @Size(min = 3, max = 50, message = "Display name must be between 3 and 50 characters")
    private String displayName;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email must be in a valid format")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
    private String password;
}
