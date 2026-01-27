package aggregation;

public class Aggregat {
	
	String name;
	int id;
	
	AggregationPgm reference;// entity reference of another class
	
	Aggregat(String name,int id,AggregationPgm reference)
	{
		this.name=name;
		this.id=id;
		this.reference=reference;
	}
	
	public void display1()
	{
		System.out.println(name);
		System.out.println(id);
		reference.display();//print method from AggregationPgm  class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggregationPgm pg=new AggregationPgm("Rose","Jasmin");
		Aggregat ag=new Aggregat("Lotus",10,pg);
		ag.display1();

	}

}
