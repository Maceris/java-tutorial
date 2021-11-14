package tutorial.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An ArrayList implementation to work on.
 */
public class MyArrayList implements List<String> {

	/**
	 * The current size of the internal array.
	 */
	int currentSize;

	/**
	 * The internal storage.
	 */
	String[] contents;

	@Override
	public void add(int index, String element) {
		// TODO fill this out
	}

	@Override
	public boolean add(String e) {
		// TODO fill this out
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		return c.stream().allMatch(this::add);
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> c) {
		c.forEach(element -> this.add(index, element));
		return true;
	}

	@Override
	public void clear() {
		// TODO fill this out
	}

	@Override
	public boolean contains(Object o) {
		// TODO fill this out
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return c.stream().allMatch(this::contains);
	}

	@Override
	public String get(int index) {
		// TODO fill this out
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO fill this out
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO fill this out
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int curIndex = 0;

			@Override
			public boolean hasNext() {
				return this.curIndex < MyArrayList.this.currentSize;
			}

			@Override
			public String next() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				}
				// Use the value before increment
				return MyArrayList.this.contents[this.curIndex++];
			}
		};
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO fill this out
		return 0;
	}

	@Override
	public ListIterator<String> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<String> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String remove(int index) {
		// TODO fill this out
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO fill this out
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return c.stream().allMatch(this::remove);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String set(int index, String element) {
		// TODO fill this out
		return null;
	}

	@Override
	public int size() {
		// TODO fill this out
		return 0;
	}

	@Override
	public List<String> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		// TODO fill this out
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}
}
