package oops;
class Maths{
	int num1,num2;
	Maths()   //Default Constructor
	{
		num1=20;
		num2=10;
	}
	void display() {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m1=new Maths();
		m1.display();

	}

}
