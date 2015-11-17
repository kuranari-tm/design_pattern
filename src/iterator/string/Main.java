package iterator.string;

import iterator.Iterator;

public class Main {

	public static void main(String[] args) {
		CharShelf charShelf = new CharShelf("ABCZ");
		Iterator it = charShelf.iterator();
		while(it.hasNext()){
			char c = (char)it.next();
			System.out.println(c);
		}
	}
}
