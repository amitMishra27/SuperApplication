package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Beans.Employee;
import com.nit.Dao.IEmployeeDao;

@Service("service")
public class commonSeriveImp implements commonServiceClass {

	
	@Autowired 
	private IEmployeeDao imdao;
	
	@Override
	public List<Employee> getSearchResult() {
		
		return imdao.getSearchResult();
	}

}
