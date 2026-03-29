package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActorDto {

  @NotBlank(message = "first name is required")
  @Size(max = 45)
  private String firstName;

  @NotBlank(message = "last name is required")
  @Size(max = 45)
  private String lastName;
}
