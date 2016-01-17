package bridge;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Moon."));
		CountDisplay d5 = new CountDisplay(new TextDisplayImpl("Greeting.html"));
		MultiTimeDisplay d6 = new MultiTimeDisplay(new CharDisplayImpl("<", "*", ">"));
		MultiTimeDisplay d7 = new MultiTimeDisplay(new CharDisplayImpl("|", "##", "-"));

		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(10);
		// d5.display();
		d5.multiDisplay(3);
		d6.multiDisplay(4);
		d7.multiDisplay(6);
	}
}
