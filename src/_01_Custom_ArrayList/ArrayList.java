package _01_Custom_ArrayList;

import java.awt.List;
import java.sql.Array;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] tfue;
	
	
	public ArrayList() {
		tfue = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return null;
	}
	
	public void add(T val) {
		T[] newer = (T[])new Object[tfue.length+1];
		newer[newer.length] = val;
	for (int i = 0; i < tfue.length; i++) {
		newer[i] = tfue[i];
	}
	tfue[] = newer[];
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		return false;
	}
}