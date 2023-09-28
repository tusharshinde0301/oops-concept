package oops;
interface I1
{
	int i=10;
}
interface I2
{
	int j=20;
}
class p
{
	int k=100;
}
class c extends p implements I1,I2
{
	void sum()
	{
		System.out.println(i+j+k);
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c C1=new c();
		C1.sum();
		
	}

}
