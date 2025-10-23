package Inheritance;

public class MultilevelChild extends MultilevelInter{
	
	public void childmethod()
	{
		System.out.println("This is child method call");
	}

	public static void main(String[] args) {
		MultilevelChild m=new MultilevelChild();
		m.parentmethod();
		m.intermethod();
		m.childmethod();

	}


}
