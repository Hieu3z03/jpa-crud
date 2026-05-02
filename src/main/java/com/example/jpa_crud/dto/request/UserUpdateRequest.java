package com.example.jpa_crud.dto.request;

import com.example.jpa_crud.validator.DobConstraint;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;

import jakarta.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;
    
    String firstName;
    String lastName;

    @DobConstraint(min = 18)
    LocalDate dob;
}
