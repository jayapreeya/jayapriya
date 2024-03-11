package day4_firstpackage;

public class executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base b1=new base();
		b1.methodDefault();
		b1.methodProtected(); 
		b1.methodPublic();
		b1.varDefault=11;
		b1.methodDefault();
		b1.varProtected=31; 
		b1.methodProtected();
		b1.varPublic=41; 
		b1.methodPublic(); 
		System.out.println(b1 instanceof base);
	}

}
