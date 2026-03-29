package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {

  @NotNull(message = "film is required")
  private Integer filmId;

  @NotNull(message = "store is required")
  private Integer storeId;
}
