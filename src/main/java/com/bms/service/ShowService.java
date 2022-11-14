package com.bms.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.bms.dto.PageResponse;
import com.bms.dto.ShowDto;
import com.bms.model.TheaterEntity;

public interface ShowService {

	ShowDto addShow(ShowDto showDto);

	PageResponse<ShowDto> searchShows(String movieName, String city, LocalDate showDate, LocalTime showTime, int pageNo, int limit);
	
	String removeShow(long showId);

	List<TheaterEntity> getTheatreDetailByMovie(long movieId);

}