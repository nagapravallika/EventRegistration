package com.event.repos;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.evententities.EventEntitites;

public interface EventRepository extends MongoRepository<EventEntitites, Integer> {

	EventEntitites findone(int id);

	
}
