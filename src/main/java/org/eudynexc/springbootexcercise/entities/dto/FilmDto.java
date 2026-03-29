package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto {

  @Size(max = 255)
  @NotBlank(message = "title is required")
  private String title;

  private String description;

  private Short releaseYear;

  @NotNull(message = "language is required")
  private Integer languageId;

  private Integer originalLanguageId;

  @NotNull(message = "rental duration is required")
  private Integer rentalDuration;

  @NotNull(message = "rental rate is required")
  private BigDecimal rentalRate;

  private Integer length;

  @NotNull(message = "replacement cost is required")
  private BigDecimal replacementCost;

  private String rating;

  private String specialFeatures;
}



































