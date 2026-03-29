package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto {

  @NotBlank(message = "name is required")
  @Size(max = 45)
  private String firstName;

  @NotBlank(message = "last name is required")
  @Size(max = 45)
  private String lastName;

  @NotNull(message = "address is required")
  private Integer addressId;

  private byte[] picture;

  @Email(message = "invalid email")
  @Size(max = 50)
  private String email;

  @NotNull(message = "store is required")
  private Integer storeId;

  @NotNull(message = "status is required")
  private Boolean active;

  @Size(max = 40)
  @NotBlank(message = "password is required")
  private String password;

  @Size(max = 16)
  @NotBlank(message = "username is required")
  private String username;
}
