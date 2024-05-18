package com.example.bco.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bco.entity.AccountHolder;
import com.example.bco.reposatory.AccountHolderReposatory;

@Service
public class AccountServiceImple implements AccountService{
	
	@Autowired
	AccountHolderReposatory reposatory;

	@Override
	public AccountHolder holder(AccountHolder accountHolder) {
		// TODO Auto-generated method stub
		return reposatory.save(accountHolder);
	}

	@Override
	public AccountHolder updateAccount(AccountHolder accountHolder) {
		// TODO Auto-generated method stub
		AccountHolder holder=reposatory.findById(accountHolder.getId()).orElseThrow(()->new RuntimeException("ID not found"));
		 
		 Float amount=holder.getAmount()+accountHolder.getAmount();
		 holder.setAmount(amount);
		
		return reposatory.saveAndFlush(holder);
	}

	@Override
	public AccountHolder deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		 AccountHolder holder=reposatory.findById(id).orElseThrow(()->new RuntimeException("account not found"));
		
		  reposatory.delete(holder);;
		  return holder;
	}

	@Override
	public List<AccountHolder> findAll() {
		// TODO Auto-generated method stub
		return reposatory.findAll();
	}

	@Override
	public AccountHolder findById(Integer id) {
		// TODO Auto-generated method stub
		 AccountHolder holder=reposatory.findById(id).orElseThrow(()->new RuntimeException("account not found"));

		return holder;
	}

}
