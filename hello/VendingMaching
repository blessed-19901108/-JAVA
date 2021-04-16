package hello;

import java.util.Scanner;

public class VendingMaching {
	int price = 80;
	int balance;
	int totol;
	
	void showPromt()
	{
		System.out.println("Welcome");
	}
	
	void insertMomey(int amount)
	{
		balance = balance + amount;
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}

	void getFood()
	{
		if(balance>=price) {
			System.out.println("Here you are!");
			balance = balance - price;
			totol = totol + price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMaching vm = new VendingMaching();
		vm.showPromt();
		vm.showBalance();
		vm.insertMomey(100);
		vm.getFood();
		vm.showBalance();
	}

}
