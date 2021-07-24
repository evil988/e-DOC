package controller;

import javax.swing.JFrame;

public interface Control<T> {
	public void save(T values[]);
	public void display(JFrame mw);
	public void clear();
	public void displayTable(JFrame mw);
}
