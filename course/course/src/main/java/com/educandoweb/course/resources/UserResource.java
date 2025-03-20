package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController //esta classe e um recurso web que e implementado por um recurso rest
@RequestMapping(value="/users") //nome do nosso recurso
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u= new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}

}
