package adapter.properties;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// 移譲によるAdapter実装をした
		// 継承による実装をすると、余計なメソッドまでFilePropertiesで公開されてしまい、
		// あまり良くないと思う
		FileIO f = new FileProperties();
		try {
			// f.readFromFile("file.txt");
			f.setValue("year", "2015");
			f.setValue("month", "11");
			f.setValue("day", "04");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
