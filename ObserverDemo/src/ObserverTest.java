
public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("\nState: 10");
		subject.setState(10);
		
		System.out.println("\nState: 9");
		subject.setState(9);
		
		System.out.println("\nState: 4");
		subject.setState(4);

	}

}
