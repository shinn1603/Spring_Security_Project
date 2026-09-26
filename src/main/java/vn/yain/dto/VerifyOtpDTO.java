package vn.yain.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class VerifyOtpDTO {
 @NotBlank @Email
 private String email;
 @NotBlank
 @Size(min = 6, max = 6)
 private String otp;

 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }
 public String getOtp() { return otp; }
 public void setOtp(String otp) { this.otp = otp; }
}
