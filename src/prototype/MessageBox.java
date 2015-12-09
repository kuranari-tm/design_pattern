package prototype;
import prototype.framework.*;
public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		printLine(length);
		System.out.println(decochar + " " + s + " " + decochar);
		printLine(length);
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	private void printLine(int length) {
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}

}
