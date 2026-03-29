package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FilmTextDto {

  @NotBlank(message = "title is required")
  private String title;

  private String description;
}
