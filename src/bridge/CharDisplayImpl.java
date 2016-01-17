package bridge;

public class CharDisplayImpl extends DisplayImpl {
	String start, str, end;
	public CharDisplayImpl(String start, String c, String end) {
		this.start = start;
		this.str = c;
		this.end = end;
	}

	@Override
	public void rawOpen() {
		System.out.print(start);
	}
	@Override
	public void rawPrint() {
		System.out.print(str);
	}
	@Override
	public void rawClose() {
		System.out.println(end);
	}

}
