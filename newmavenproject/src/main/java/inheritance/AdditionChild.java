package inheritance;
public class AdditionChild extends Addition{
	int div;	
	public void add()
	{
		super.add(10,20);		
		System.out.println("Sum is"+ this.sum);
		div=this.sum%10;
		
		if (div==0)
		{
			System.out.println("Sum is divisible by 10");
		}
		else
		{
			System.out.println("Sum is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionChild c=new AdditionChild();
		c.add();

	}

}
