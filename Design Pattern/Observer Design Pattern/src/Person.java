public class Person implements IObserver {

	private String story;
	private ISubject subject;
	
	Person(ISubject subject){
		this.subject=subject;
	}
	
	@Override
	public void update() {
		this.story=subject.getState();
		System.out.println("Value has been updated with the new value as "+story);
	}

}
