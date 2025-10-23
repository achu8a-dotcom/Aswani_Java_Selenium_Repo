package accesmodifier;

public class privateaccessmod {
	
	private void display()
	{
		System.out.println("Private access modifier");
	}
	public void display1()
	{
		System.out.println("Public access modifier");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateaccessmod m=new privateaccessmod();
		m.display();
		m.display1();
	}

}
