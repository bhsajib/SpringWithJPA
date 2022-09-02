package com.example.SpringWithJPA.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWithJPA.entity.Coustomer;
import com.example.SpringWithJPA.service.ServiceInf;


@RestController
@RequestMapping("/jpaproject")

public class MyController {

@Autowired	
ServiceInf srvInfo;	

@RequestMapping(value ="/test", method = RequestMethod.GET)
public String Test() {
	System.out.println(" hello");
	
	return "Hello Sajib";
 
}

@GetMapping("/t1")
public String Test1() {
	System.out.println(" hello");
	
	return "Hello Sajib";
 
}

@GetMapping("/home")
public Map<String, String> home() {
	Map<String, String> info= new HashMap<String, String>();
	info.put("Name", "Sajib Bhowmick");
	info.put("Address", "Badkulla");
	
	return info;
}

@GetMapping("/getcust")
public List<Coustomer> AllUser(){
	
	return srvInfo.getAll();
	
}

}
