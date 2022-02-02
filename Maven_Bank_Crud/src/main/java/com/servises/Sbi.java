package com.servises;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.getHibernateUtil.HibernateConfig;
import com.model.Account;

public class Sbi implements RBI {

	
	SessionFactory sessionFactory=HibernateConfig.getSessionFactory();
	Scanner sc=new Scanner(System.in);
	
	
	public  void createAccount() {	
		Account ac=new Account();
		Session session = sessionFactory.openSession();
		System.out.println("Enter Account No");
		ac.setAccountno(sc.nextLong());
		
		System.out.println("Enter Name");
		String name=sc.next();
		name=name+sc.nextLine();
		ac.setName(name);
		
		System.out.println("Enter Addres");
		ac.setAddres(sc.next());
		
		System.out.println("Enter Balance");
		ac.setBalance(sc.nextDouble());
		
		session.beginTransaction();
		session.save(ac);
		System.out.println("Data Added");
		session.getTransaction().commit();
	}

	public void viewAccount() {
		
	

	}

	public void deposite() {
		
	}

	public void withDraw() {
		
	}

	public void update() {
		

	}

	public void viewBalance() {
		

	}

}
