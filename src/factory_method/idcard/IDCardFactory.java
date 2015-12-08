package factory_method.idcard;
import java.util.*;

import factory_method.framework.*;

public class IDCardFactory extends Factory{
	private List owners = new ArrayList();
	private int index = 0;
	private Map ownerTable = new HashMap();
	protected Product createProduct(String owner) {
		return new IDCard(owner, index++);
	}

	protected void registerProduct(Product product) {
		IDCard idCard = (IDCard)product;
		owners.add(idCard.getOwner());
		ownerTable.put(idCard.getId(), idCard.getOwner());
	}

	public List getOwners() {
		return owners;
	}
	
	public Map getOwnerTable(){
		return ownerTable;
	}
	
}
