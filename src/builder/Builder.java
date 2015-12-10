package builder;

public abstract class Builder {
	private boolean initialized = false;
	public void makeTitle(String title) throws Exception {
		checkUninitialized();
		buildTitle(title);
		initialized = true;
	}
	public void makeString(String str) throws Exception {
		checkInitialized();
		buildString(str);
	}
	public void makeItems(String[] items) throws Exception {
		checkInitialized();
		buildItems(items);
	}
	public void close() throws Exception {
		checkInitialized();
		buildDone();
	}

	private void checkUninitialized() throws Exception {
		if (initialized) throw new Exception();
	}

	private void checkInitialized() throws Exception {
		if (!initialized) throw new Exception();
	}

	protected abstract void buildTitle(String title);
	protected abstract void buildString(String str);
	protected abstract void buildItems(String[] items);
	protected abstract void buildDone();
}
