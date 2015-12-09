package singleton;

public class TicketMaker {
	private static TicketMaker maker = new TicketMaker();
	private int ticket = 1000;
	private TicketMaker() { }
	public int getNextTicketNumber() {
		return ticket++;
	}
	public static TicketMaker getInstance() {
		return maker;
	}
}
