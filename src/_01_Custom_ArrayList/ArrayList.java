package _01_Custom_ArrayList;

import java.awt.List;
import java.sql.Array;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T[] tfue;

	public ArrayList() {
		tfue = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return tfue[loc];
	}

	public void add(T val) {
		T[] add = (T[]) new Object[tfue.length + 1];
		add[add.length - 1] = val;
		for (int i = 0; i < tfue.length; i++) {
			add[i] = tfue[i];
		}
		tfue = add;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insert = (T[]) new Object[tfue.length + 1];
		for (int i = 0; i < insert.length; i++) {
			if (i < loc) {
				insert[i] = tfue[i];
			} else if (i > loc) {
				insert[i] = tfue[i - 1];
			} else {
				insert[i] = val;
			}
		}
		tfue = insert;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		tfue[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove = (T[]) new Object[tfue.length - 1];
		for (int i = 0; i < tfue.length; i++) {
			
			if (i < loc) {
				remove[i] = tfue[i];
			}
			else if (i > loc) {
				remove[i - 1] = tfue[i];
			} else {
				continue;
			}
		}
		tfue = remove;
	}

	public boolean contains(T val) {
		for (int i = 0; i < tfue.length; i++) {
			if(tfue[i].equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return tfue.length;
	}
}