import java.util.ArrayList;
import java.util.List;

public class QuoraPage implements ISubject {
	
	private String story;
	private List<IObserver> observers=new ArrayList<>(); 
	
	@Override
	public void follow(IObserver person) {
		observers.add(person);
	}
	
	@Override
	public void unfollow(IObserver person) {
		if(observers.remove(person)) {
			System.out.println("Person is removed!");
		}
	}
	
	@Override
	public void notifyObservers() {
		observers.forEach(person -> person.update());
	}

	@Override
	public String getState() {
		return this.story;
	}

	@Override
	public void setState(String story) {
		this.story=story;
		notifyObservers();
	}
}
