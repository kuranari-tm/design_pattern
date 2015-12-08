package factory_method.television;
import factory_method.framework.*;
public class Television extends Product{
	private String serial;
	Television(String serial) {
		this.serial = serial;
	}

	public void use() {
		System.out.println("製品番号: " + serial);
	}
	public String getSerial(){
		return serial;
	}
}
