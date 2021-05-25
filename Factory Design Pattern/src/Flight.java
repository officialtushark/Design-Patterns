public class Flight implements ITransportMode{

	@Override
	public void pickup() {
		System.out.println("Parcel picked up via a Flight!");
	}
	
	@Override
	public void travel() {
		System.out.println("Parcel travelling to destination via air!");
	}
	
	@Override
	public void deliver() {
		System.out.println("Parcel delivered to the client!");
	}
}
