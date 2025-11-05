package abstraction;

public class CarAbstract implements VehicleAbstract{
	
	public void display()
	{
		System.out.println("Car model");
	}

	public static void main(String[] args) {
		CarAbstract v=new CarAbstract();
		v.display();
		
		
	

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
