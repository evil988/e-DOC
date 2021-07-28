package model;

public class Consultation {
	private String patName;
	private String docName;
	private String date;
	private String time;
	
	public Consultation(String pat, String doc, String date, String time) {
		this.patName = pat;
		this.docName = doc;
		this.date = date;
		this.time = time;
	}

	public String getPatName() {
		return patName;
	}

	public String getDocName() {
		return docName;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}	
}
