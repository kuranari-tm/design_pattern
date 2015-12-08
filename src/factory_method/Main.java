package factory_method;
import factory_method.framework.*;
import factory_method.idcard.*;
import factory_method.television.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Alice");
		Product card2 = factory.create("Bob");
		card1.use();
		card2.use();
		Factory tvFactory = new TelevisionFactory();
		Product tv1 = tvFactory.create("");
		Product tv2 = tvFactory.create("");
		tv1.use();
		tv2.use();
	}

}
