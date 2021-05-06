package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao; // manager hibernate'den asla haberdar degil. manager sadece kullanacagi interfaceinden haberdar.

	
	public ProductManager(ProductDao productDao) {  // asla hibernate'e bagimli degilsin. ama onun tutacagi referanslara baglisin.
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		
		// is Kodlari
		
		if(product.getCategoryId() ==1) {
			System.out.println("Bu kategoriye urun kabul edilmiyor . ");
			return;
		}
		// HibernateProductDao dao = new HibernateProductDao(); // bunu yaparsam, calisir. ama ben dogru degil. ben buraya alternatif bir servisi entegre edemem.
		
		this.productDao.add(product); // hic bir sekilde hibernate'e bagimliligim yok
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}


// eger ben newleyerek bunu siki sikiya baglarsam, o zaman unit test de yazamam. (unit test= kodu kodla kontrol etmek)
// ben bunun icin ne yapacagım? dependency injektion yapacagim. ben buna bagliyim.bunu gevsek baglayacagim.
// sen data access' e baglisin. ama gevsek baglisin. data access'in ancak referans tutucu olan, abstract klasorundeki yapisina
// bagimli olabilirsin. => dependency injection

// return => gordugu anda asagiya bakmaz. metodu bitirir.


