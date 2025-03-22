package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;
import com.springboot.service.TicketService;



@Controller
public class TicketController 
{
	@Autowired
	private TicketService ticketService;
	
	
	@GetMapping("/addPassenger")
	public String addDetailsforBook(Model model)
	{
		model.addAttribute("list",new Ticket());
		
		return "bookTicket";
		
	}
	
	@PostMapping("/ticket")
	public String bookDetails(@ModelAttribute Passenger p)
	{
		
		ticketService.getTicket(p);
		return "redirect:/alltickets";
	}
	
	@GetMapping("/alltickets")
	public String getAllTickets(Model model)
	{
		List<Ticket> allTickets = ticketService.allTickets();
		model.addAttribute("tickets",allTickets);
		return "index";
	}
}
