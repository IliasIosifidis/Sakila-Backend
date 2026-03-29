package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "inventory_id")
  private int id;

  @ManyToOne
  @JoinColumn(name = "film_id", nullable = false)
  private Film film;

  @ManyToOne
  @JoinColumn(name = "store_id", nullable = false)
  private Store store;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime lastUpdate;
}
