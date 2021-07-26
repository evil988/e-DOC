package model;

public interface Dao<T1, T2> {
	public void add(T1 obj);
	public T2 show();
}
