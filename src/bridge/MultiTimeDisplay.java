package bridge;

public class MultiTimeDisplay extends CountDisplay {
	public MultiTimeDisplay(DisplayImpl impl) {
		super(impl);
	}
 
	public void multiDisplay(int count) {
		for(int i = 0; i < count; i++) {
			super.multiDisplay(i);
		}
	}
}
