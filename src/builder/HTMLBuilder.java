package builder;

import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;
	
	@Override
	protected void buildTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	protected void buildString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	@Override
	protected void buildItems(String[] items) {
		writer.println("<ul>");
		for(int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	protected void buildDone() {
		writer.print("</body></html>");
		writer.close();
	}
	public String getResult() {
		return filename;
	}

}
