package com.example.bco.service;

import java.util.List;

import com.example.bco.entity.AccountHolder;

public interface AccountService {
	
public AccountHolder holder(AccountHolder accountHolder);
public AccountHolder updateAccount(AccountHolder accountHolder);
public AccountHolder deleteAccount(Integer id);
public List<AccountHolder> findAll();
public AccountHolder findById(Integer id);

}
