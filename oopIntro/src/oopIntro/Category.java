package oopIntro;

public class Category {

	private int id;
	private String name;
	
	
	public Category() {
		super();
	}

	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}
	 
	public void setId(int id) {  // dışardan birşey alınca onu parametreye ekliyoruz.
		this.id=id;
	}
	
	public String getName() {
		return this.name + " ! ";
	}
	
	public void setName(String name) {
		this.name= name ;
	}
}
