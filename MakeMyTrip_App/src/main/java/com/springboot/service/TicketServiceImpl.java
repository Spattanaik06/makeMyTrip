package com.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.binding.Passenger;
import com.springboot.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Override
	public Ticket getTicket(Passenger p) 
	{
		String urlString="http://localhost:8080/ticket";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Ticket> postForEntity = restTemplate.postForEntity(urlString, p, Ticket.class);
		Ticket ticket = postForEntity.getBody();
		return ticket;
		
		
		
		
	}
	
	
	

	@Override
	public List<Ticket> allTickets() {
		String urlString="http://localhost:8080/allticket";
		RestTemplate restTemplate=new RestTemplate();
		Ticket[] tickets = restTemplate.getForEntity(urlString, Ticket[].class).getBody();
		return Arrays.asList(tickets);
		
	}

}
