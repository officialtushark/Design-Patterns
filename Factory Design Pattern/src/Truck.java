public class Truck implements ITransportMode{
	
	@Override
	public void pickup() {
		System.out.println("Parcel picked up via a Truck!");
	}
	
	@Override
	public void travel() {
		System.out.println("Parcel travelling to destination via road!");
	}
	
	@Override
	public void deliver() {
		System.out.println("Parcel delivered to the client!");
	}
}
