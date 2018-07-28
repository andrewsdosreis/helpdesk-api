package com.andrews.helpdesk.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrews.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	public Page<Ticket> findByUserIdOrderByDateDesc(String userId, Pageable pages);
	
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc
		(String title, String status, String priority, Pageable pages);
	
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc
		(String title, String status, String priority, String userId, Pageable pages);
	
	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignedUserIdOrderByDateDesc
		(String title, String status, String priority, String assignedUserId, Pageable pages);
	
	public Page<Ticket> findByNumber(Integer number, Pageable pages);

}
