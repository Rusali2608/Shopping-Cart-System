package com.example.demo.ewallet.daolayer;

import java.util.List;

import com.example.demo.ewallet.model.Ewallet;
import com.example.demo.ewallet.model.Statement;

public interface EwalletService {
	public List<Ewallet> getWallets();
	public Ewallet addWallet(Ewallet ewal);
	public void addMoney();
	public Ewallet update(Ewallet ewal);
	public String getById(String eid);
	public String deleteById(String id);
	public List<Statement> getStatementsById(String id);
	public List<Statement> getStatements();
	
}
