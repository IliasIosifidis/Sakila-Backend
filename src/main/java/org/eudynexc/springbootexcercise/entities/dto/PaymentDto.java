package org.eudynexc.springbootexcercise.entities.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

  @NotNull(message = "customer is required")
  private Integer customerId;

  @NotNull(message = "staff is required")
  private Integer staffId;

  private Integer rentalId;

  @NotNull(message = "amount is required")
  private BigDecimal amount;
}
