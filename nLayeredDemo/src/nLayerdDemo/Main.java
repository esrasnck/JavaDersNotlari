package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;

import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// ToDo : Spring Ioc ile cozulecek.
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter()); // => test etmek icin newledim. ama ileride bunu springIoc ile cozulecek. (iyilestirilecek)
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);

	}

}




// bir projede entityler haric newliyorsak, anlayin ki ileride problem yasayacaksiniz (altin kural).