package aggregation;

public class AggregationPgm {
	
	String city;
	String country;
	
	
	AggregationPgm(String city,String country)
	{
		this.city=city;
		this.country=country;
	}

	public void display()
	{
		System.out.println(city);
		System.out.println(country);
	}

}
