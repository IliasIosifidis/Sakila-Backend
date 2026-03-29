package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "language")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "language_id")
  private int id;

  @Column(length = 20, columnDefinition = "char", nullable = false)
  private String name;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime lastUpdate;
}
