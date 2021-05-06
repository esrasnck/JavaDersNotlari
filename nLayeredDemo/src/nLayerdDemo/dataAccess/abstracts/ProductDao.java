package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product get(int id);
	
	
	
	List<Product> getAll();
	
	// Product[] getAll(); // liste olunca bu isin array'i lazim. 

}

// list=> array list'in base i. => .net deki karsiligi " IList "

// array list=> import java.util.ArrayList;

// array listlerde tip belirtirken, int seklinde yazarsak kizar. o yüzden acik acik yazmak gerek.

// ArrayList<Integer> sayilar => gibi. bu da bir liste yapisidir. icerisinde hangi tipin olacagini yazarsinir. buna generic yapilar
// denir.

// arrayler sabit  yapilardir. bir array'e 3 tane eleman ekledik. array'e 4. elemanı eklemeye calissak, array ucar gider.



