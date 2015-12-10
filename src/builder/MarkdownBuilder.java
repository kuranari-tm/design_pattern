package builder;

public class MarkdownBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();

	@Override
	protected void buildTitle(String title) {
		buffer.append("# " + title + "\n");
	}

	@Override
	protected void buildString(String str) {
		buffer.append("## " + str + "\n");
	}

	@Override
	protected void buildItems(String[] items) {
		for(int i = 0; i < items.length; i++) {
			buffer.append("- " + items[i] + "\n");
		}
	}

	@Override
	protected void buildDone() {
		
	}

	public String getResult() {
		return buffer.toString();
	}
}
