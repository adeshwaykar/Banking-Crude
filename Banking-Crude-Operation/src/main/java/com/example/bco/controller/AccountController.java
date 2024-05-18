package com.example.bco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bco.entity.AccountHolder;
import com.example.bco.service.AccountService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@PostMapping
	public ResponseEntity<AccountHolder>SaveData(@RequestBody AccountHolder holder){
	
		return ResponseEntity.ok(service.holder(holder));
		
	}
	@GetMapping
	public ResponseEntity<List<AccountHolder>>getData(){
	
		return ResponseEntity.ok(service.findAll());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<AccountHolder>getAcoountDetails(@PathVariable Integer id){
	
		return ResponseEntity.ok(service.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<AccountHolder>delete(@PathVariable Integer id){
		return ResponseEntity.ok(service.deleteAccount(id));
		
	}
	
	@PutMapping()
	public ResponseEntity<AccountHolder>updateAccount(@RequestBody AccountHolder accountHolder){
		
		return ResponseEntity.ok(service.updateAccount(accountHolder));
		
	}
	
}
