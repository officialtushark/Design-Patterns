public interface ISubject {

	void follow(IObserver observer);

	void unfollow(IObserver person);

	void notifyObservers();

	String getState();
	
	void setState(String story);

}