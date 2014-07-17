package spring_tutorial_5.springtest;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	
	public  Person() {
	}
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	public void speak(){
		System.out.println("Hello, I am person");
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}


	
}
