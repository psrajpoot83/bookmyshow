package com.bms.service;

import java.util.List;

import com.bms.dto.TheaterDto;

public interface TheaterService {

	TheaterDto addTheater(TheaterDto theaterDto);

	TheaterDto getTheater(long id);
	
	List<TheaterDto> getTheatreDetailByMovie(long id);
}