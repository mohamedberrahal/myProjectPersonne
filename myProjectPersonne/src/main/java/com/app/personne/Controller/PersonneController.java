package com.app.personne.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.personne.model.Personne;
import com.app.personne.repository.PersonneRepository;
/**
 * 
 * @author classe d'exposetion web service 
 *
 */
@RestController
@RequestMapping("/rm")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class PersonneController {

	@Autowired
	private PersonneRepository  personneRepository;
	
	@GetMapping("/list")
	public List<Personne> getAllPersonne() {
		
		return personneRepository.findAll();
	}
	
	
	@GetMapping("/show/id")
	public Personne getPersonne(@PathVariable Long id) {
		
		return  personneRepository.getOne(id);
	}
	
	@PostMapping("/add")
	public Personne savePersonne( @RequestBody Personne personne) {
		
	 return	personneRepository.save(personne);
	}
	
	
	public Personne updatePersonne(@RequestBody Personne personne) {
		
		
		return  personneRepository.save(personne);
	}
	
	
	public boolean deletePersonne(@ PathVariable Long  id) {
		
 		 personneRepository.deleteById(id);
		return  true;
	}
	
}



