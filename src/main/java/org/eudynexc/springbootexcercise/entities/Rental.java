package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "rental")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rental {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rental_id")
  private int id;

  @Column(nullable = false)
  private LocalDateTime rentalDate;

  @JoinColumn(name = "inventory_id")
  @ManyToOne
  private Inventory inventory;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @Column
  private LocalDateTime returnDate;

  @ManyToOne
  @JoinColumn(name = "staff_id")
  private Staff staff;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime lastUpdate;
}
