package com.event.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.repos.EventRepository;
import com.evententities.EventEntitites;

@Service
public class EventServicesImpl implements EventServices {

	@Autowired
	private EventRepository repository;
	@Override
	public EventEntitites saveEventEntitites(EventEntitites evententitites) {
		return repository.save(evententitites);
	}

	@Override
	public EventEntitites updateEventEntitites(EventEntitites evententitites) {
		return  repository.save(evententitites);
	}

	@Override
	public void deleteEventEntitites(EventEntitites evententitites) {
		repository.delete(evententitites);
	}

	@Override
	public EventEntitites getEventEntititesById(int id) {
		return repository.findone(id);
	}

	@Override
	public List<EventEntitites> getAllEventEntitites() {
		return repository.findAll();
	}

}
