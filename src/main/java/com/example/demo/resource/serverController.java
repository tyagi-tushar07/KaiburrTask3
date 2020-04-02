package com.example.demo.resource;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Servers;
import com.example.demo.repositories.serverRepositories;

@RestController
public class serverController {
	
	@Autowired
	private serverRepositories repo;
	
	@PutMapping("/addserver")
	public String saveservers(@RequestBody Servers server  )
	{
		repo.save(server);
		return "Added Server successfully";
	}
	
	@GetMapping("/getservers")
	public List<Servers> getServers(){
		return repo.findAll();
		
	}
	
	@GetMapping("/getservers/{id}")
	public Optional<Servers> getServerByID(@PathVariable int id){
		return repo.findById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteserver(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Successfully Deleted";

	}
	
	

}
