package com.andrews.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrews.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
