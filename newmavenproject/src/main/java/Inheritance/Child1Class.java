package Inheritance;

public class Child1Class extends ParentClass{
	
	public void child1method()
	{
		System.out.println("This is Child1 class method");
	}

	public static void main(String[] args) {
	Child1Class n=new Child1Class();
	n.child1method();
	n.calling();
	//n.child2method();

	}

}
