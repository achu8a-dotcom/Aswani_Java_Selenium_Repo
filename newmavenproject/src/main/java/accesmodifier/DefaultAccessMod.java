package accesmodifier;

public class DefaultAccessMod {
	
	void call()
	{
		System.out.println("This is default access modifier call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultAccessMod d=new DefaultAccessMod();
		d.call();

	}

}
