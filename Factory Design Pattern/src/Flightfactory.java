public class Flightfactory extends Transport{
	@Override
	protected ITransportMode getTransportInstance() {
		return new Flight();
	}
}
