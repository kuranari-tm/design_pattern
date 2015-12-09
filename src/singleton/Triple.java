package singleton;

public class Triple {
	private static Triple[] instances = {new Triple(), new Triple(), new Triple()};
	public static Triple getInstance(int i) {
		return instances[i];
	}
}
