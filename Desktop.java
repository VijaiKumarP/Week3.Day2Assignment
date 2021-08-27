package Week2.Day2Assignments;

public class Desktop implements HardWare,Software{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop objDesktop=new Desktop ();
		objDesktop.softwareResources("Windows 11 Pro", 15000.00);
		objDesktop.hardwareResources("AMD Ryzen 7", 40000.00);
	}

	@Override
	public void softwareResources(String software, double price) {
		// TODO Auto-generated method stub
		System.out.println("Software Name : " + software );
		System.out.println("Software Price : " + price );
	}

	@Override
	public void hardwareResources(String hardware1, double price) {
		// TODO Auto-generated method stub
		System.out.println("Hardware Name : " + hardware1 );
		System.out.println("Hardware Price : " + price );		
		
	}
	

}
