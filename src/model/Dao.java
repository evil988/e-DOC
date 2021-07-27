package model;

public interface Dao<T> {
	public void add(T obj);
	public String[][] show();
}
