package polymorphism;

public class Child extends Parent{
	
	public void print()
	{
		super.print();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.print();
		Parent p=new Child();
		p.print();
		
	}

}
