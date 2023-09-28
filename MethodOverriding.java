package oops;

class vehicle   //parent class
{
	void run() 
	{
		System.out.println("vehicle is running");
	}
}
class bike extends vehicle{         //creating child class
    /*void run(){
    	System.out.println("bike is running safely");
    }*/
}

public class MethodOverriding {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub           
		
		bike b1=new bike();       //creating object              
		b1.run();                 //calling method
				

	}

}
