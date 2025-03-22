package com.springboot.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket 
{
	private Integer ticketNumber;
	private Long phoneNo;
	private String email;
	private String doj;
	private String startPoint;
	private String endPoint;
	private String trainNumber;
	private String name;
	private String trainStatus;
}
