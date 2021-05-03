package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers); // kullanabilmek icin newlemek gerek.
		
		Customer engin = new Customer(1,"Engin","Demirog");
		
		customerManager.add(engin);
		


	}

}
