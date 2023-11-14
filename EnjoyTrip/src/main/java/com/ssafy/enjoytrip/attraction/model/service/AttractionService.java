package com.ssafy.enjoytrip.attraction.model.service;

import java.util.List;

import com.ssafy.enjoytrip.attraction.model.Attraction;
import com.ssafy.enjoytrip.attraction.model.AttractionFestival;
import com.ssafy.enjoytrip.attraction.model.AttractionFood;
import com.ssafy.enjoytrip.attraction.model.AttractionList;
import com.ssafy.enjoytrip.attraction.model.AttractionParameter;

public interface AttractionService {
	List<Attraction> listAttraction(Attraction attraction);
	AttractionList listAttraction(AttractionParameter attractionParameter);
	void insertAttractionFood(AttractionFood food);
	void insertAttractionFestival(AttractionFestival attractionFestival);
}
