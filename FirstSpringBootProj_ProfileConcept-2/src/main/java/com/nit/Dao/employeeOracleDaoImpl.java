package com.nit.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nit.Beans.Employee;

@Repository("oracleDao")
@Profile("staging")
public class employeeOracleDaoImpl implements IEmployeeDao {
	
	@Autowired
	private DataSource ds;
	
	public List<Employee> getSearchResult()
	{
		List<Employee> empList=new ArrayList<Employee>();
		try {
		// TODO Auto-generated method stub
				Connection conn=ds.getConnection();
				
PreparedStatement ps=conn.prepareStatement("select empno,empname,empsal,empdesg from employee_oracle ");
			
				
				System.out.println("===="+ps.toString());
				
				ResultSet rs=ps.executeQuery();
				System.out.println("============="+rs.next());
				 
				
				
				while(rs.next())
				{
					
					Employee e=new Employee();
					e.setEmpno(rs.getInt(1));
					e.setEmpname(rs.getString(2));
					e.setEmpsal(rs.getString(3));
					e.setEmpjob(rs.getString(4));
					empList.add(e);
					
				}
				
				
			}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
		return empList;
		
	}

	
	
	}
	

