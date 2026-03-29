package org.eudynexc.springbootexcercise.entities.repository;

import org.eudynexc.springbootexcercise.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
  List<Film> findAllByRating(String rating);
  List<Film> findByRentalDuration(Integer rentalDuration);
}
