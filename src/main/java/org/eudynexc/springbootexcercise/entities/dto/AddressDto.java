package org.eudynexc.springbootexcercise.entities.dto;

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
public class AddressDto {

  @NotBlank(message = "address name is required")
  @Size(max = 50)
  private String address;

  @Size(max = 50)
  private String address2;

  @NotBlank(message = "district is required")
  @Size(max = 20)
  private String district;

  @Size(max = 20)
  private String postalCode;

  @NotBlank(message = "phone is required")
  @Size(max = 20)
  private String phone;

  @NotNull(message = "city is required")
  private Integer cityId;
}
