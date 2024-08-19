package com.caramel.waffleshop.entity;

import com.caramel.waffleshop.utils.AppConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Schema(
        name = "UserData",
        description = "Model to store user information"
)
@Entity(name = "user_data")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    @Column(name="id")
    Long id;

    @Column(name = "first_name")
    @NotEmpty(message = "First name must not empty")
    String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Last name must not empty")
    String lastName;

    @Column(name = "email")
    @NotEmpty(message = "Email must not empty")
    String email;

    @Column(name = "mobile_number")
    @Pattern(regexp = AppConstants.MOBILE_REGEX, message = "Mobile number must be 10 digits")
    String mobileNumber;
}
