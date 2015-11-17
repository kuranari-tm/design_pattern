package adapter.banner;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("hoge");
		p.printWeak();
		p.printStrong();
	}

}
