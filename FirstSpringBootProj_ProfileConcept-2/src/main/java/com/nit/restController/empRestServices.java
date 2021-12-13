package com.nit.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.Beans.Employee;
import com.nit.Dao.IEmployeeDao;

@RestController
@RequestMapping("/results")
public class empRestServices implements empServiceInterf {
	
	@Autowired
	private IEmployeeDao dao;
	
	public  ResponseEntity<List<Employee>> getEmpResult()
	{
		List<Employee> al=dao.getSearchResult();
		return new ResponseEntity<List<Employee>>(al,HttpStatus.OK);
	}

}
