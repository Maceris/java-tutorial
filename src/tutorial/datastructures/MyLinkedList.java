package tutorial.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * A linked list implementation to be worked on.
 */
public class MyLinkedList implements List<Integer> {

	/**
	 * A node in the linked list.
	 */
	protected static class ListNode {
		/**
		 * The previous node, if present.
		 */
		public ListNode previous;
		/**
		 * The next node, if present.
		 */
		public ListNode next;
		/**
		 * The value stored in this node.
		 */
		public Integer value;
	}

	/**
	 * The first node in the list.
	 */
	protected ListNode firstNode;

	/**
	 * @throws NullPointerException if the specified element is null and this
	 *             list does not permit null elements
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 */
	@Override
	public void add(int index, Integer element) {
		// TODO fill this out
	}

	@Override
	public boolean add(Integer e) {
		// TODO fill this out
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		return c.stream().allMatch(this::add);
	}

	/**
	 * @throws NullPointerException if the specified element is null and this
	 *             list does not permit null elements
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 */
	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
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

	/**
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 */
	@Override
	public Integer get(int index) {
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
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			ListNode cur = MyLinkedList.this.firstNode;

			@Override
			public boolean hasNext() {
				return this.cur.next != null;
			}

			@Override
			public Integer next() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				}
				this.cur = this.cur.next;
				return this.cur.value;
			}
		};
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO fill this out
		return 0;
	}

	@Override
	public ListIterator<Integer> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 */
	@Override
	public Integer remove(int index) {
		// TODO fill this out
		return null;
	}

	/**
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 * @throws NullPointerException if the specified element is null and this
	 *             list does not permit null elements
	 */
	@Override
	public boolean remove(Object o) {
		if (null == o) {
			return false;
		}
		if (o instanceof Integer) {
			if (!contains(o)) {
				return false;
			}
			int index = indexOf(o);
			remove(index);
			return true;
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return c.stream().allMatch(this::remove);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @throws NullPointerException if the specified element is null and this
	 *             list does not permit null elements
	 * @throws IndexOutOfBoundsException if the index is out of range
	 *             (<tt>index &lt; 0 || index &gt; size()</tt>)
	 */
	@Override
	public Integer set(int index, Integer element) {
		// TODO fill this out
		return null;
	}

	@Override
	public int size() {
		// TODO fill this out
		return 0;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
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
