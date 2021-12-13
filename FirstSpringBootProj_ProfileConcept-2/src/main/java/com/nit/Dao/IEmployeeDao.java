package com.nit.Dao;

import java.util.ArrayList;
import java.util.List;

import com.nit.Beans.Employee;

public interface IEmployeeDao {
	
	default public List<Employee> getSearchResult()
	{
		System.out.println("Default Results!");
		List<Employee> list =new ArrayList<Employee>();
		return list;
	}


}
