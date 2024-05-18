package com.example.bco.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bco.entity.AccountHolder;

@Repository
public interface AccountHolderReposatory extends JpaRepository<AccountHolder, Integer>{

}
