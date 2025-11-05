package exceptionhandling;

public class ExceptionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		int a=100/0;
		System.out.println(a);
}

catch(Exception e) {
	System.out.println(e);
}

finally
{
	System.out.println("Finally Block");
}
	}

}
