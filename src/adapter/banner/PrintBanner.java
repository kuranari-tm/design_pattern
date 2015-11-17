package adapter.banner;

public class PrintBanner implements Print {
	private Banner banner;
	public PrintBanner(String str) {
		this.banner = new Banner(str);
	}
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
