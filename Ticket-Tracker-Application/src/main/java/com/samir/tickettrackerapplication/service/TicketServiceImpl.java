package com.samir.tickettrackerapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samir.tickettrackerapplication.dao.TicketDao;
import com.samir.tickettrackerapplication.model.Ticket;
@Service
public class TicketServiceImpl implements TicketService {
	TicketDao ticketdao;
	

	public TicketServiceImpl(TicketDao ticketdao) {
		super();
		this.ticketdao = ticketdao;
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketdao.findAll();
	}

	@Override
	public Ticket getTicket(int id) {
		// TODO Auto-generated method stub
		return ticketdao.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketdao.save(ticket);
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketdao.save(ticket);
	}

	@Override
	public void deleteTicket(int id) {
		// TODO Auto-generated method stub
		ticketdao.deleteById(id);

	}

}
