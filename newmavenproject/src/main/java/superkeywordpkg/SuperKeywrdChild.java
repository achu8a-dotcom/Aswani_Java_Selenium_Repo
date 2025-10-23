package superkeywordpkg;

public class SuperKeywrdChild extends SuperKeywrdParent {

	int x=50;
	
	public void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywrdChild c=new SuperKeywrdChild();
		c.display();

	}

}
