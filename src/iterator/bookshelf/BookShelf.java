package iterator.bookshelf;

import java.util.ArrayList;

import iterator.Aggregate;
import iterator.Iterator;

public class BookShelf implements Aggregate {
	private ArrayList books;
	public BookShelf(int initialSize) {
		this.books = new ArrayList(initialSize);
	}
	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}
	public void appendBook(Book book) {
		books.add(book);
	}
	public int getLength() {
		return books.size();
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
