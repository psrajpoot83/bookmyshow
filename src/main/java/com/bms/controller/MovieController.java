package com.bms.controller;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.dto.MovieDto;
import com.bms.service.MovieService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("movie")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping("add")
	public ResponseEntity<MovieDto> addMovie(@RequestBody MovieDto movieDto) {

		log.info("Received Request to add new movie: " + movieDto);

		return ResponseEntity.ok(movieService.addMovie(movieDto));
	}

	@GetMapping("{id}")
	public ResponseEntity<MovieDto> getMovie(@PathVariable(name = "id") @Min(value = 1, message = "Movie Id Cannot be -ve") long id) {

		log.info("Received Request to get movie: " + id);

		return ResponseEntity.ok(movieService.getMovie(id));
	}
}