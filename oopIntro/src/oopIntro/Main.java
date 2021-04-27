package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product0 = new Product(1,"Kenova",15000,"16 GB RAM");
		
		Product product1 = new Product(); // örnek oluşturma, referans oluşturma, instance creation(alma)
		
		
	    product1.id= 1;
	    product1.name="Lenova V14";
	    product1.unitPrice=15000;
	    product1.detail ="16 GB Ram"; // kümülatif bir ürün listesi oluştu.
	    
	    // persistancy = kalıcı demek. db de tutmak demek 
	    
		Product product2 = new Product();
	    product2.id= 2;
	    product2.name="Lenova V15";
	    product2.unitPrice=16000;
	    product2.detail ="32 GM Ram";
	    
		Product product3 = new Product();
	    product3.id= 3;
	    product3.name="HP 5";
	    product3.unitPrice=10000;
	    product3.detail ="8 GM Ram";
		
	    // classlar referans tiptir.
		
		Product[] products = {product0 ,product1, product2, product3};
		
		System.out.println(products.length);
		 
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		
		Category category1 = new Category();
		
		category1.id=1;
		category1.name= "bilgisayar";
		
	   Category category2 = new Category();
		
		category2.id=2;
		category2.name= "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1); // product'ın bellek adresini göndermiş oluyoruz.
		productManager.addToCart(product2);
		productManager.addToCart(product3);

		
	}

}
