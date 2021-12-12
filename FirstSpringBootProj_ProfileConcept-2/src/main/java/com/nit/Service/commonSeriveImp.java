package com.nit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Dao.IEmployeeDao;

@Service("service")
public class commonSeriveImp implements commonServiceClass {

	
	@Autowired 
	private IEmployeeDao imdao;
	
	@Override
	public int getSearchResult() {
		
		return imdao.getSearchResult();
	}

}
