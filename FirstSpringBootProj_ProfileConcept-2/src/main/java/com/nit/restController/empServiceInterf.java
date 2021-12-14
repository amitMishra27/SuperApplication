package com.nit.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.Beans.Employee;

public interface empServiceInterf {
	

	
	@RequestMapping("/getSearchResult")
	default  ResponseEntity<List<Employee>> getEmpResult()
	{
		Employee emp=new Employee();
		List<Employee> al=new ArrayList<Employee>();
		al.add(emp);
		return new ResponseEntity<List<Employee>>(al,HttpStatus.OK);
		
	}
	default ResponseEntity<String> getObject()
	{
		return new ResponseEntity<String>("Dfault Method Executed",HttpStatus.OK);
		
	}

	
}
