package controller;

public interface Control<T1, T2> {
	public void save(String values[]);
	public String[][] tabRows();
	public T1 getRegView();
	public T2 getTabView();
}
