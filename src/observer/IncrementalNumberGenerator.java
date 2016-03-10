package observer;

public class IncrementalNumberGenerator extends NumberGenerator {
	private int start, end, step;
	private int number;
	public IncrementalNumberGenerator(int start, int end, int step){ 
		this.start = start;
		this.end = end;
		this.step = step;
	}
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for(int i = start; i < end; i += step){
			number = i;
			notifyObserver();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			}
		}
	}

}
