package superkeywordpkg;

public class SuperKeywrdChildMeth extends SuperKeywrdParentMeth{

	public void parentmethod()
	{
		super.parentmethod();
		System.out.println("This is child method call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperKeywrdChildMeth cm=new SuperKeywrdChildMeth();
cm.parentmethod();

		
	}

}
