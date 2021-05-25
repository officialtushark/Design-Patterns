public class TruckFactory extends Transport{
	@Override
	protected ITransportMode getTransportInstance() {
		return new Truck();
	}
}
