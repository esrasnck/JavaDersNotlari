package inheritance;

public class Main {

	public static void main(String[] args) {

		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber ="12345";		
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
	    hepsiburada.customerNumber ="7897987987";
	 
	    SendikaCustomer abcCustomer = new SendikaCustomer();
	    abcCustomer.customerNumber ="99999" ;
	   
	    CustomerManager customerManager = new CustomerManager();
		
//	    customerManager.add(hepsiburada);
//	    customerManager.add(engin);
//	    customerManager.add(abcCustomer);  // ahanda burada polymorphism yapıyoruz.

	    Customer [] customers= {engin,abcCustomer,hepsiburada};
	    
		customerManager.addMultiple(customers);
		
	}

}
 

 