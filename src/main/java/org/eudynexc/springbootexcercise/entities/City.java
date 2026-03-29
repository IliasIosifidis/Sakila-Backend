package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "city")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class City {

  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int cityId;

  @Column(length = 50, nullable = false)
  private String city;

  @ManyToOne
  @JoinColumn(name = "country_id")
  private Country country;

  @Column
  private LocalDateTime lastUpdate;
}
