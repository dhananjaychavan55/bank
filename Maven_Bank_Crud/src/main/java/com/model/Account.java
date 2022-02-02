package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account_Info")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Account_No")
	private long accountno;
	@Column(name="Account_Name")
	private String name;
	@Column(name="Addres")
	private String Addres;
	@Column(name="Ac_Balance")
	private double balance;
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return Addres;
	}
	public void setAddres(String addres) {
		Addres = addres;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accountno=" + accountno + " Name=" + name + " Addres=" + Addres + " Balance=" + balance;
	}
	
	
	
	
	
}
