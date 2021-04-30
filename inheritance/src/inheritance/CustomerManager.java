package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	// aynı anda birden fazla müşteri eklemek = bulk operasyonu (bulk insert)
	
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer :customers) {
			add(customer);
		}
		
	}
	
}


// tekrar kullanilabilirlik için metot yaptık : reusabilityn (oop faydaları)

// Solid => Open Closed Princeple : sisteme yeni özellik eklendiğinde mevcuttaki kodu değiştiremezsin. sadece eklersin.


//public void add(IndividualCustomer customer) { 
//
//System.out.println(customer.customerNumber +  "Kaydedildi. ");
//
//}
//
//
//public void add(CorporateCustomer customer) { 
//  System.out.println(customer.customerNumber +  " Kaydedildi. ");
//}