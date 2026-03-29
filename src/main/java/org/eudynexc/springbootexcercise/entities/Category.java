package org.eudynexc.springbootexcercise.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int categoryId;

  @Column(length = 25, nullable = false)
  private String name;

  @Column(length = 25, nullable = false)
  private LocalDateTime lastUpdate;

  @ManyToOne
  @JoinTable(
          name = "film_category",
          joinColumns = @JoinColumn(name = "category_id"),
          inverseJoinColumns = @JoinColumn(name = "film_id")
  )
  private List<Film> films;
}
