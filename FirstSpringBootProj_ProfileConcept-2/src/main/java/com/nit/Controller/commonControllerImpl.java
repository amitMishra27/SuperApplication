package com.nit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Beans.Employee;
import com.nit.Service.commonServiceClass;

@Controller("cntrl")
public class commonControllerImpl {
	
	@Autowired
	private commonServiceClass cserivce;
	
	public List<Employee> getResults()
	{
		return cserivce.getSearchResult();
	}

}
