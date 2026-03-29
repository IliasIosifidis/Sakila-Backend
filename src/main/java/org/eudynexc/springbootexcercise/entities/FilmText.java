package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "film_text")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FilmText {

  @Id
  @Column
  private int filmId;

  @Column(nullable = false)
  private String title;

  @Column(columnDefinition = "text")
  private String description;
}
