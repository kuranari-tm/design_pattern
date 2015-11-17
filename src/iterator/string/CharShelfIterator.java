package iterator.string;

import iterator.Iterator;

public class CharShelfIterator implements Iterator {
	private CharShelf charShelf;
	private int index;
	public CharShelfIterator(CharShelf charShelf) {
		this.charShelf = charShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < charShelf.getLength();
	}

	@Override
	public Object next() {
		char c = charShelf.getCharAt(index);
		index++;
		return c;
	}

}
