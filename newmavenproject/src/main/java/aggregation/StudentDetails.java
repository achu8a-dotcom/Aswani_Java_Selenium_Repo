package aggregation;

public class StudentDetails {
	
	String name;
	int rollno;
	
	StudentDetails(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no:"+rollno);
	}
}
