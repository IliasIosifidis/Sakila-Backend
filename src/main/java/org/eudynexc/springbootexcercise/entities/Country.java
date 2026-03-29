package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "country")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "country_id")
  private int id;

  @Column(nullable = false,length = 50)
  private String country;

  @Column
  private LocalDateTime lastUpdate;
}
