package com.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Service.commonServiceClass;

@Controller("cntrl")
public class commonControllerImpl {
	
	@Autowired
	private commonServiceClass cserivce;
	
	public int getResults()
	{
		int i=cserivce.getSearchResult();
		
		return i;
	}

}
