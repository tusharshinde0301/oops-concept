package oops;

/*class Area
{
	void Area(int l,int b)
	{
		System.out.println("Area of Rectangle = "+l*b);
	}
	void Area(float r)
	{
		System.out.println("Area of Circle = "+3.14*r*r);
	}
}*/


class calculation
{
	void add(int i,int j)
	{
		System.out.println((i+j));
	}
	void add(int i,float j)
	{
		System.out.println(i+j);
	}
	void add(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Area a1=new Area();
		a1.Area(12, 10);
		a1.Area(10);*/
		
		calculation c1=new calculation();
		c1.add(12, 10);
		c1.add(12, 20.33f);
		c1.add("Tush", "ar");

	}

}
