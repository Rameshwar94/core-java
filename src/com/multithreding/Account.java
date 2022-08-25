package com.multithreding;
//Synchrnization Exmple
public class Account {
private int balance=5000;//private to achieve Encapsultion

public int getBalance() {
	return balance;
}

public void withDraw(int amount) {
	balance=balance-amount;
}

}
