package controller;

public interface Control {
	public void save(String values[]);
	public String[][] tabRows();
	public void regView(Object mw);
	public void tabView(Object mw);
	public void recObs(Observer o);
	public void unRegObs(Observer o);
}
