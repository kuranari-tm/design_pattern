package iterator.string;

import iterator.Aggregate;
import iterator.Iterator;

public class CharShelf implements Aggregate {
	private String str;
	public CharShelf (String str) {
		this.str = str;
	}
	public int getLength () {
		return str.length();
	}
	public char getCharAt(int index){
		return str.charAt(index);
	}
	@Override
	public Iterator iterator() {
		return new CharShelfIterator(this);
	}
	
}
