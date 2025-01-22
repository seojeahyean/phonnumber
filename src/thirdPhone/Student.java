package thirdPhone;

public class Student {
	private String name;
	private String major;
	private String pn;
	private String memo;
	public Student(String name, String major, String pn, String memo) {
		this.name = name;
		this.major = major;
		this.pn = pn;
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String m) {
		this.major = m;
	}

	public String getPn() {
		return this.pn;
	}
	public void setPn(String p) {
		this.pn = p;
	}
	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String m) {
		this.memo = m;
	}
	

}