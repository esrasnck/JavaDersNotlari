package oopIntro;

public class Product {
	
	// encapsulation
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	
	public Product() {
		
	}

	

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount= discount;
		
	}


	public int getId() {   // id oku
		return id;
	}


	public void setId(int id) { // id set et.
		this.id = id;
	}


	public String getName() { // burada da okuyum 
		return this.name;  // burası için this.name ile name aynı.
	}


	public void setName(String name) { // bana bir isim gönder
		this.name = name;  // ben bunu set ediyim.
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return this.unitPrice- (this.unitPrice * this.discount /100);
	}
	
	


	
	


}

// 	super(); => basedekini çalıştırır anlamında.

//constructor : bir nesnenin referansını bellekte oluşturduğu zaman(newlediğinde) çalışan blokdu.
// constructor : yapıcı blog demek
// bir constructor çalışmak zorunda
// birden fazla constructor varsa, sadece biri (bu yapıda yazarsak, çalışır)
// class ikiye ayrılıyor. : is yapan classlar. özellik içeren classlar. yapı aynı. isimlendirme farklı


// get=> okuma (readonly)
// set=> yazma
// c# daki get; set; kavramının karşılığı java da yok. biz bunları getter ve setter ile hallediyoruz.

// final => dışardan erişimi kapatır. sadece consturctorda set edilebilir demek.
// private=> sadece bu classın içinde kullanılabilir demek.
