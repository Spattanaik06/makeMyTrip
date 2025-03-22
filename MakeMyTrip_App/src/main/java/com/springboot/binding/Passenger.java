package com.springboot.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//swagger documentation

//{
//email	[...]
//phoneNo	[...]
//doj	[...]
//startPoint	[...]
//endPoint	[...]
//trainNumber	[...]
//name	[...]
//}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger 
{
	private long phoneNo;
	private String email;
	private String doj;
	private String startPoint;
	private String endPoint;
	private String trainNumber;
	private String name;

}


