public class Main {

	public static void main(String[] args) {
		//Using to transport via Truck
		Transport transportMode= new TruckFactory();
		transportMode.transport();
		
		//Using to transport via Flight
		transportMode= new Flightfactory();
		transportMode.transport();
	}

}
