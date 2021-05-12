
public class SuperB extends SuperA{
	int a;
	void display()
	{
		System.out.println("It is B");
		super.display();//to get the content of SuperA
		a=20;
		super.a=200;
		int c=a+super.a;
		System.out.println(c);
	}
	void SuperDisplay() {
	super.display();
	}
	
	public static void main(String[] args) {
		SuperB b= new SuperB();
		b.display();
		//b.SuperDisplay();//By this method also we can call the method of class A
		
	}


}
