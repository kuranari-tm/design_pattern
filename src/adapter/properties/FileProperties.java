package adapter.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
	Properties prop;

	public FileProperties() {
		prop = new Properties();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		prop.load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		prop.store(new FileOutputStream(filename), "");
	}

	@Override
	public void setValue(String key, String value) {
		prop.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return prop.getProperty(key);
	}

}
