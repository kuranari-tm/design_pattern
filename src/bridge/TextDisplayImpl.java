package bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDisplayImpl extends DisplayImpl{
	private String filename;
	BufferedReader br;
	public TextDisplayImpl(String filename) {
		this.filename = filename;
	}

	@Override
	public void rawOpen() {
		try {
			br = new BufferedReader(new FileReader(filename));
			br.mark(1024);
			System.out.println("# " + filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void rawPrint() {
		String line = "";
		try {
			br.reset();
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
