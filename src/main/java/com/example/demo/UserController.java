package com.example.demo;

import java.sql.Connection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends UserDAO {
	
	@CrossOrigin
	@PostMapping("/login")
	public String UserLogin(@RequestBody User us) {
		
		System.out.println(us.pswd+us.username);
		UserDAO obj=new UserDAO();
		obj.connect();
		
		boolean i = obj.authenticateUser(us);
		if(i==true)
		{
			
			return "Valid";
		}
		else
		{
			
			return "Invalid";
		}
	}
	
	/*@CrossOrigin
	@PostMapping("/logintest")
	public String UserLoginTest(@PathVariable String p) {
		return p;
	}*/
}
