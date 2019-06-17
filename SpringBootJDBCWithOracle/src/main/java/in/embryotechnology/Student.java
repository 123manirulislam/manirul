package in.embryotechnology;

public class Student {

	private Integer slno;
	private String fname;
	private String lname;
	private Long phnone;
	
	
	public Student(Integer slno, String fname, String lname, Long phnone) {
		super();
		this.slno = slno;
		this.fname = fname;
		this.lname = lname;
		this.phnone = phnone;
	}
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Long getPhnone() {
		return phnone;
	}
	public void setPhnone(Long phnone) {
		this.phnone = phnone;
	}
	
}
