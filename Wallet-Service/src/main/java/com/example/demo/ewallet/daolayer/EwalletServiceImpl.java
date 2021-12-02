package com.example.demo.ewallet.daolayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.ewallet.model.Ewallet;
import com.example.demo.ewallet.model.Statement;
import com.example.demo.ewallet.repository.EwalletRepository;
import com.example.demo.ewallet.repository.StatementRepository;

public class EwalletServiceImpl implements EwalletService {

	@Autowired
	EwalletRepository EwalRepo;
	
	@Autowired
	StatementRepository sRepo;
	
	
	@Override
	public List<Ewallet> getWallets() {
		//return list<ewallet> is a cast type
		return (List<Ewallet>) EwalRepo.findAll();
	}

	@Override
	public Ewallet addWallet(Ewallet ewal) {
		Ewallet ew = EwalRepo.save(ewal);
		return ew;
	}

	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ewallet update(Ewallet ewal) {
		Ewallet ew = EwalRepo.save(ewal);
		return ew;
		
	}

	@Override
	public String getById(String eid) {
		EwalRepo.findById(eid);
		return null;
	}

	@Override
	public String deleteById(String id) {
		EwalRepo.deleteById(id);
		return "Ewallet" +id+ "deleted";
	}

	@Override
	public List<Statement> getStatementsById(String id) {
		
		//return (List<Statement>) sRepo.findAllById(id) ;
		return null;
	}

	@Override
	public List<Statement> getStatements() {
		
		return (List<Statement>) sRepo.findAll();
	}

}
