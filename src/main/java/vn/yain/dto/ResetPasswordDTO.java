package vn.yain.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ResetPasswordDTO {
 @NotBlank @Email
 private String email;
 @NotBlank
 @Size(min = 6)
 private String password;
 @NotBlank
 private String confirmPassword;

 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }
 public String getPassword() { return password; }
 public void setPassword(String password) { this.password = password; }
 public String getConfirmPassword() { return confirmPassword; }
 public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }
}
