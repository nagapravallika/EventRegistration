package com.event.services;
import java.util.*;
import com.evententities.EventEntitites;

public interface EventServices
{
	EventEntitites saveEventEntitites(EventEntitites evententitites);
	EventEntitites updateEventEntitites(EventEntitites evententitites);
	void deleteEventEntitites(EventEntitites evententitites);
	EventEntitites getEventEntititesById(int id);
	List<EventEntitites>getAllEventEntitites();
	
	

}
