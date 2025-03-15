package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	@Override
	public boolean add(T item) {
		if(size == items.length){
			items = returnArray();
		}
		items[size] = item;
		size++;
		return false;
	}

	public Object[] returnArray() {
		Object[] newArray = new Object[items.length*2];
		System.arraycopy(items,0,newArray,0,items.length);
		return newArray;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public T get(int index) {
		if(index >= size || index < 0){
			return null;
		}
		return (T) items[index];
	}
	
}
