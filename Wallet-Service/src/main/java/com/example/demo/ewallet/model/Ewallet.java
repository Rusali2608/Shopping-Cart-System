package com.example.demo.ewallet.model;

import java.util.List;

public class Ewallet {
	private String ewalletId;
	private double currentBalance;
	@Override
	public String toString() {
		return "Ewallet [ewalletId=" + ewalletId + ", currentBalance=" + currentBalance + "]";
	}
	public String getEwalletId() {
		return ewalletId;
	}
	public void setEwalletId(String ewalletId) {
		this.ewalletId = ewalletId;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
}
