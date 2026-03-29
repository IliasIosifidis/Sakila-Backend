package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "actor")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private int actorId;

  @Column(nullable = false, length = 45)
  private String firstName;

  @Column(nullable = false, length = 45)
  private String lastName;

  @Column(nullable = false)
  private LocalDateTime lastUpdate;
}
