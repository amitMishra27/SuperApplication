package com.nit.Dao;

public interface IEmployeeDao {
	
	default public int getSearchResult()
	{
		System.out.println("Default Results!");
		return 1;
	}


}
