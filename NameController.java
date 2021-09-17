package com.example.nameapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	
	@Autowired
	private NameService nameService;
	@GetMapping("/show-names")
	public List<Name> showNames()
	{
		return  nameService.retrieveAllNames();
		
	}

}
