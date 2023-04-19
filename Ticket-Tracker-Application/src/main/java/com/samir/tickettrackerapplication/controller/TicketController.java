package com.samir.tickettrackerapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samir.tickettrackerapplication.model.Ticket;
import com.samir.tickettrackerapplication.service.TicketService;

@Controller
@RequestMapping("ticket")
public class TicketController {
	TicketService tecketService;
	
	public TicketController(TicketService tecketService) {
		super();
		this.tecketService = tecketService;
	}

	@GetMapping("/home")
	public String showTicket(Model model) {
		model.addAttribute("tickets",tecketService.getAllTickets() );
		return "ticket-home";
	}
	@GetMapping("/create-ticket")
	public String createTicket(Model model) {
		model.addAttribute("ticket",new Ticket() );
		return "tickets";
	}
}
