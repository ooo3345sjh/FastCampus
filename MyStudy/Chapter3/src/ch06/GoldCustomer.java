package ch06;

public class GoldCustomer extends Customer {
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
	}
	
	public int calCPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
