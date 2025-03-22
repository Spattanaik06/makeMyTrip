package com.springboot.service;

import java.util.List;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;

public interface TicketService 
{
	public Ticket getTicket(Passenger p);
	public List<Ticket> allTickets();
	
}
