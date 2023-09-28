package oops;
class GrandParent{
	String surname= "Shinde";
}
class parent1 extends GrandParent{
	String middlename= "Mahipal";
}
class child1 extends parent1{
	String name="Tushar";
	void display() {
		System.out.println(name+middlename+surname);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		child1 c2=new child1();           //creating object
		c2.display();                    //calling object
	}

}
