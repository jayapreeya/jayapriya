package day4_thirdpackage;

public class MyClass {
	private static MyClass obj=new MyClass();
	private int id; public int getId() {
	return id; 
	}
	public void setId(int id) {
	this.id=id; 
	}
	private MyClass() {
	System.out.println("MyClass object created");
	}
	public static MyClass getObject() 
	{
		return obj;
	}
	public String toString() { 
	return "MyClass [id=" + id + "]"; 
	}
}
