package main;

public class student {
	private String name;
	private String major;
	private String pn;

	public student(String name, String major, String pn) {
		this.name = name;
		this.major = major;
		this.pn = pn;
	}

	public String getName() {
		return this.name;
	}

	public String getMajor() {
		return this.major;
	}

	public String getPn() {
		return this.pn;
	}

}
