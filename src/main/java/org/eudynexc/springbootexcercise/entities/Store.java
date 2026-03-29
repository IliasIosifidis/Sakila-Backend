package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "store")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "store_id")
  private int id;

  @JoinColumn(name = "manager_staff_id")
  @ManyToOne
  private Staff manager;

  @ManyToOne
  @JoinColumn(name = "address_id")
  private Address address;

  @UpdateTimestamp
  @Column(nullable = false)
  private LocalDateTime lastUpdate;
}
