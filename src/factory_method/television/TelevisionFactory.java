package factory_method.television;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import factory_method.framework.*;

public class TelevisionFactory extends Factory{
	Map database = new HashMap();

	@Override
	protected Product createProduct(String owner) {
		return new Television(UUID.randomUUID().toString());
	}

	@Override
	protected void registerProduct(Product product) {
		Television tv = (Television)product;
		database.put(tv.getSerial(), tv);
	}

}
