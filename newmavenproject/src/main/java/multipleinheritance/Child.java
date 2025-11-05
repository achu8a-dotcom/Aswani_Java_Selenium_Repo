package multipleinheritance;

public class Child implements Parent1,Parent2{
	
	public void math() {
		System.out.println("Parent 1 method");
		
	}

	@Override
	public void add() {
		System.out.println("Parent 2 method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.math();
		c.add();

	}

	
	

}
