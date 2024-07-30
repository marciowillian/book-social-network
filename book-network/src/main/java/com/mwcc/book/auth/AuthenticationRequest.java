package com.mwcc.book.auth;

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
public class AuthenticationRequest {

    @Email(message = "Email is not formatted")
    @NotEmpty(message = "Email is mandotory")
    @NotBlank(message = "Email is mandadory")
    private String email;
    @NotEmpty(message = "Password is mandotory")
    @NotBlank(message = "Password is mandadory")
    @Size(min = 8, message = "PAssword should be 8 charatcers long minimum")
    private String password;

}
