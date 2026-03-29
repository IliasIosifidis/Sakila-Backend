package org.eudynexc.springbootexcercise.entities.service;

import org.eudynexc.springbootexcercise.entities.dto.FilmDto;

import java.util.List;

public interface FilmService {
  List<FilmDto> findAll();
  List<FilmDto> findAllByRating(String rating);
  List<FilmDto> findByRentalDuration(Integer rentalDuration);
  FilmDto findById(Integer filmId);
  FilmDto addFilm(FilmDto filmDto);
}
