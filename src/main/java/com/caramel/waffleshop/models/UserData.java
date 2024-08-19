package com.caramel.waffleshop.models;

import com.caramel.waffleshop.utils.AppConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Schema(
        name = "UserData",
        description = "Model to store user information"
)
@Data
public class UserData {
    @Nullable
    Long id;

    @NotEmpty(message = "First name must not empty")
    String firstName;

    @NotEmpty(message = "Last name must not empty")
    String lastName;

    @NotEmpty(message = "Email must not empty")
    String email;

    @Pattern(regexp = AppConstants.MOBILE_REGEX, message = "Mobile number must be 10 digits")
    String mobileNumber;
}
