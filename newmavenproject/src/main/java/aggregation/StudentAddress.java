package aggregation;
public class StudentAddress {
	String address;	
	StudentDetails reference;// entity reference of another class
	StudentAddress(String address,StudentDetails reference)
	{
		this.address=address;
		this.reference=reference;
	}
	
	public void display1()
	{
		
		reference.display();//print method from AggregationPgm  class
		System.out.println("Address:" +address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails sd=new StudentDetails("Aswini",10);
		StudentAddress sa=new StudentAddress("ABC Street",sd);
		sa.display1();
	}

}
