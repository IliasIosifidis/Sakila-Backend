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
public class RentalDto {

  @NotNull(message = "inventory is required")
  private Integer inventoryId;

  @NotNull(message = "customer is required")
  private Integer customerId;

  @NotNull(message = "staff is required")
  private Integer staffId;
}
