package com.mwcc.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname is mandotory")
    @NotBlank(message = "Firstname is mandotory")
    private String firstname;
    @NotEmpty(message = "Lastname is mandotory")
    @NotBlank(message = "Lastname is mandotory")
    private String lastname;
    @Email(message = "E-mail is not formated")
    @NotEmpty(message = "E-mail is mandotory")
    @NotBlank(message = "E-mail is mandotory")
    private String email;
    @NotEmpty(message = "Password is mandotory")
    @NotBlank(message = "Password is mandotory")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;
}
