class Overloading{
	double ar;


	Overloading(){
		System.out.println("This is Constuctor Overloading");
		System.out.println("Constuctor Executing");
	}

	Overloading(String n,String c){
		String name = n;
		String city = c;
	}
	void calcarea(double r){
		ar=3.14*r*r;
		System.out.println("Area of circle:"+ar);
}
	public static void main(String args[]){
	
	Overloading o = new Overloading();
	o.calcarea(3);
	}
}