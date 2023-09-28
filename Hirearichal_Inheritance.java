package oops;
class shape
{
	void draw() 
	{
		System.out.println("This will draw a shape");
	}
}
class circle extends shape
{ 
	
}
class rectangle extends shape
{
	
}
class triangle extends shape
{
	
}
public class Hirearichal_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new shape();
		circle c1=new circle();
		rectangle r1=new rectangle();
		triangle t1=new triangle();
		s1.draw();
		c1.draw();
		r1.draw();
		t1.draw();

	}

}
