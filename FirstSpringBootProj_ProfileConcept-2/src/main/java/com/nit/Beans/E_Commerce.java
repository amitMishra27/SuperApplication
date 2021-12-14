package com.nit.Beans;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class E_Commerce {
	
	private String name;
	
	private String  addrs;
	
	private Integer size;
	
	private List<Courier> courier;
	
	private Set<Payementgetway> payementgetway;
	
	

	
	
}
