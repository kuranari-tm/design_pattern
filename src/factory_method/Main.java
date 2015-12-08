package factory_method;
import factory_method.framework.*;
import factory_method.idcard.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Alice");
		Product card2 = factory.create("Bob");
		card1.use();
		card2.use();
	}

}
