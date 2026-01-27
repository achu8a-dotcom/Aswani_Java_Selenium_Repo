package polymorphism;

public class PolymorphismPgm {
	
	public void add()
	{
		System.out.println("Polymorphism");
	}
	
	public void add(int a,int b)
	{
		System.out.println("Sum is" +(a+b));
	}
	
	public void add(double c,double d)
	{
		System.out.println("Sum is" +(c+d));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismPgm p=new PolymorphismPgm();
		p.add();
		p.add(1,2);
		p.add(1.2,2.2);

	}

}
