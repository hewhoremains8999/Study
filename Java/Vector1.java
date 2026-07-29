import java.util.*;

class Vector1{
public static void main(String[] args){

	Vector<Number> v=new Vector<>(3,2);
	System.out.println("Initial Size:" +v.size());
	System.out.println("Initial Cap:" +v.capacity());
	v.addElement(50);
	v.addElement(9);
	v.addElement(34);
	v.addElement(97);
	v.addElement(17);
	System.out.println(v);
	System.out.println("After Cap:" +v.capacity());
	v.add(5.6);
	System.out.println(v);
	System.out.println("After Cap:" +v.capacity());
	System.out.println("First Element:" +v.firstElement());
	
	System.out.println("Last Element:" +v.lastElement());
	if(v.contains(50)){
		System.out.println("Hurray We Have 50!!!");
	}
	System.out.println("\nLooping through the Vector");
	
	for (Object item:v){
		
	System.out.println(item);
	}


}
}