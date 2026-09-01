class A{
	static void geta(){
		System.out.println("I am A");
	}
	
}
class B extends A{
	void getb(){
		System.out.println("I am B");
	}
}
class C extends B{ //inheriting B which inherits A
	void getc(){
		System.out.println("I am jarvis");
	}
}
class Inherit{
public static void main (String args[]){
	C c= new C();
	c.getc();
	c.geta();
	c.getb();
	A.geta(); //static method hai


	}
}