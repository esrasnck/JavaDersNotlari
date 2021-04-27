package oopIntro;

public class Product {
	
	// constructor : yapıcı blog demek
	// bir constructor çalışmak zorunda
	// birden fazla constructor varsa, sadece biri (bu yapıda yazarsak, çalışır)
	// class ikiye ayrılıyor. : is yapan classlar. özellik içeren classlar. yapı aynı. isimlendirme farklı
	
	public Product() {
		
		System.out.println("Ben çalıştım");
	}
	
	public Product(int id,String name, double unitPrice, String detail) { // metot overloading
		
		this();
		this.id = id;
		this.name= name;
		this.unitPrice= unitPrice;
		this.detail = detail;

	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	

}
