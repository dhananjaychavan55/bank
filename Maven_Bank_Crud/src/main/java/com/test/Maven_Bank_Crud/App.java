package com.test.Maven_Bank_Crud;

import java.util.Scanner;


import com.servises.Sbi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Sbi rbi=new Sbi();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag) {
			
			System.out.println("---------Welcome--------");
			System.out.println("1: Create Account ");
			System.out.println("2: View Account ");
			System.out.println("3: Deposite Money ");
			System.out.println("4: View Balance");
			System.out.println("5: Update Account");
			System.out.println("6: WithDrwal Balance");
			System.out.println("7: Exit ");
			
			int key=sc.nextInt();
			switch (key) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.viewAccount();
				break;
			case 3:
				rbi.deposite();
				break;
			case 4:
				rbi.viewBalance();;
				break;
			case 5:
				rbi.update();
				break;
			case 6:
				rbi.withDraw();
				break;
			
			case 7:
				   System.out.println("Thank You!!");
				   flag=false;
				break;

			default:
				System.out.println("Enter right option");
				break;
			}
						
			
		}
		
       
    	
    }
}
