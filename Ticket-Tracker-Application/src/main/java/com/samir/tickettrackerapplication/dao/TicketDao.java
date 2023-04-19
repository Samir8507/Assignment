package com.samir.tickettrackerapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir.tickettrackerapplication.model.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
