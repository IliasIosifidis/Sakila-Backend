package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

  @NotNull(message = "store is required")
  private Integer storeId;

  @Size(max = 45)
  @NotBlank(message = "name is required")
  private String firstName;

  @Size(max = 45)
  @NotBlank(message = "last name is required")
  private String lastName;

  @Size(max = 50)
  @Email(message = "invalid email form")
  private String email;

  @NotBlank(message = "address name is required")
  private Integer addressId;

  @NotNull(message = "status is required")
  private Boolean active;
}
