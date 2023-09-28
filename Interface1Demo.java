package oops;
interface M1
{
	void add(int i,int j);
}
interface M2
{
	void sub(int i,int j);
}
class Z implements M1,M2
{

	@Override
	public void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i-j);
		
	}

	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
	
}

public class Interface1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 Z z1=new Z();
		 z1.add(12, 10);
		 z1.sub(12, 10);
	}

}
