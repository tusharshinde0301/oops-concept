package oops;
class parent
{
	String surname="Shinde";
}
class child extends parent
{
	String name="Tushar";
	void display(){
		System.out.println(name+surname);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c1=new child();     //creating object
        c1.display();            //calling method
	}

}
