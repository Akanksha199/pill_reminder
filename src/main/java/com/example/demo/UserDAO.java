package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO{
	private Connection con;
	static Statement st;
	public Boolean connect() {
		Boolean x=false;
		try {
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			st=this.con.createStatement();
			x=true;
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return x;
		
	}
	
	@SuppressWarnings("deprecation")
	public boolean authenticateUser(User u){
		Boolean s=false;
		try {
	    String rowcount = ("Select * from LoginInfo where username='"+u.username+"' AND pswd='"+u.pswd+"'");
		
			
			
            ResultSet x=st.executeQuery(rowcount);
                 	
           
            
            while(x.next())
            	{
            	          	
            	s=true;
            	}
            
            
            }catch(Exception ex) {
            	System.out.println(ex);
                   
            }
		
		return s;
	}
	
}