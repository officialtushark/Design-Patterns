public class Main {

	public static void main(String[] args) {
		ISubject subject=new QuoraPage();
		IObserver observer=new Person(subject);
		subject.follow(observer);
		subject.setState("This is my first Story!");
		subject.unfollow(observer);
	}
}
