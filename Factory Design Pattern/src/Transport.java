public abstract class Transport{
	
	public void transport() {
		ITransportMode transport=getTransportInstance();
		transport.pickup();
		transport.travel();
		transport.deliver();
	}

	protected abstract ITransportMode getTransportInstance();
}