package Inheritance;

import accesmodifier.protectedacessmod;

public class Child2Class extends protectedacessmod {

	public void child2class()
	{
		System.out.println("This is child2 class method");
	}
	public static void main(String[] args) {
		
		Child2Class n1=new Child2Class();
		n1.child2class();
		//n1.calling();
		protectedacessmod p=new protectedacessmod();
		 n1.show();
	}

}
