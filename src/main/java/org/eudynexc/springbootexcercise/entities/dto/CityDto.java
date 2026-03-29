package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {

  @Size(max = 50)
  @NotBlank(message = "city is required")
  private String city;
  private LocalDateTime lastUpdate;


  @NotNull(message = "country is required")
  private Integer countryId;
}
