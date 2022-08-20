package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("이순신");
		customer.setBonusPoint(1000);
		customer.setCustomerID(10001);
		System.out.println(customer.showCustomerInfo());
		
		Customer vipCustomer = new VIPCustomer();
		vipCustomer.setCustomerName("김유신");
		vipCustomer.setBonusPoint(5000);
		vipCustomer.setCustomerID(10002);
		System.out.println(vipCustomer.showCustomerInfo());
	}

}
