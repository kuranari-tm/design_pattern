package observer;

public class HexObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("HexObserver  :" + Integer.toHexString(generator.getNumber()));
	}
}
