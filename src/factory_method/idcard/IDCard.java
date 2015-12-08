package factory_method.idcard;
import factory_method.framework.*;

public class IDCard extends Product {
	private String owner;
	private int id;
	IDCard(String owner, int id) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
		this.id = id;
	}
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}
	public int getId(){
		return id;
	}
}
