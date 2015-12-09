package builder;

public class Main {

	public static void main(String[] args) {
		{
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		}
		{
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String filename = htmlBuilder.getResult();
			System.out.println(filename + "が作成されました。");
		}
	}
}
