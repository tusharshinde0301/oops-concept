package oops;
class Test{
	int r;
	Test(int radius)  //parameterized Constructor
	{
	  r=radius;      //define para.constructor		
	}
	void display() 
	{
		System.out.println("Area of circle: "+3.14*r*r);
	}
}

public class ParametrizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(10);  //parameterized constructor calling
		t1.display();
		

	}

}
