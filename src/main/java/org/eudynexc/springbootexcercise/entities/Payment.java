package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_id")
  private int id;

  @JoinColumn(name = "customer_id")
  @ManyToOne
  private Customer customer;

  @ManyToOne
  @JoinColumn(name = "staff_id")
  private Staff staff;

  @ManyToOne
  @JoinColumn(name = "rental_id")
  private Rental rental;

  @Column(nullable = false)
  private BigDecimal amount;

  @Column(nullable = false)
  private LocalDateTime paymentDate;

  @Column
  @UpdateTimestamp
  private LocalDateTime lastUpdate;
}
