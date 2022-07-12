package com.vikas.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnimalService {
	@Autowired
	private AnimalRepository animalrepo;
	
	List<Animals> getallanimals(){
		return animalrepo.findAll();
	}
	

}
