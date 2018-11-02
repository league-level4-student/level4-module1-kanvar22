package _01_Custom_ArrayList;

import java.util.Stack;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Stack<T> stacks= new Stack<T> ();
	
	public ArrayList() {
	
		
	
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return stacks.get(loc);
	}
	
	public void add(T val) {
		stacks.add(val);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		stacks.insertElementAt(val, loc);
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		stacks.set(loc, val);
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		stacks.remove(loc);
	}
	
	public boolean contains(T val) {
		if (stacks.contains(val) == true) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return stacks.size();
	}
}