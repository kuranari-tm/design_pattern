package bridge;

import java.util.Random;

public class RandomDisplay extends Display{
	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int maxTimes) {
		open();
		Random rand = new Random();
		int times = rand.nextInt(maxTimes);
		for(int i = 0; i < times; i++) {
			print();
		}
		close();	
	}

}
