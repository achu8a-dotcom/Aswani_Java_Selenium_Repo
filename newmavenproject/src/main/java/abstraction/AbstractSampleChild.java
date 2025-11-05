package abstraction;

public class AbstractSampleChild extends AbstractSample{
	
	public void sound()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractSampleChild c=new AbstractSampleChild();
		c.sound();
		c.action();

	}

}
