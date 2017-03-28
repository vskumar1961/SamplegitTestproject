package Inherit1;
//Example on Inheritance - Class1
// Used this class as reference for other classes
public class InheritClass {
int a = 10;
int b = 20;
//Defined Non-static method
// To extend by other classes in this package
public void add() { 
	System.out.println(a+b);
}

public static void main(String [] args) {
	InheritClass objA = new InheritClass();
	System.out.println(objA.a);// Accessing the variable a
	objA.add();//Accessing the add() method
}
}
