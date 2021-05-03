package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		// müşteri ekleme kodları.
		System.out.println("Müşteri eklendi... s");
		
		logger.log();
		
	}
}


// miras verilen sınıf yani bizim temel sınıfımız, base class file'ın referansını tutar. Ne yollarsak, aslında onun log'u çalışır.

// yüzdeyüz ortak mı? olayı oluyor aslında. Yüzde yüz ortak değil ise, tekrarlamamız gerekiyor. Modellemenin mantığı


