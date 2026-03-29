package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private int addressId;

  @Column(nullable = false, length = 50)
  private String address;

  @Column(length = 50)
  private String address2;

  @Column(nullable = false, length = 20)
  private String district;

  @ManyToOne
  @JoinColumn(name = "city_id")
  private City city;

  @Column(length = 10)
  private String postalCode;

  @Column(length = 20, nullable = false)
  private String phone;

  @Column(nullable = false)
  private LocalDateTime lastUpdate;
}
