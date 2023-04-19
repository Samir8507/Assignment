package com.samir.tickettrackerapplication.service;

import java.util.List;

import com.samir.tickettrackerapplication.model.Ticket;

public interface TicketService {
	public List<Ticket> getAllTickets();

	public Ticket getTicket(int id);

	public Ticket updateTicket(Ticket ticket);

	public Ticket saveTicket(Ticket ticket);

	public void deleteTicket(int id);

}
