package pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "ACE_NO")
	String aceNo;
	String name;
	Date doj,dob;

	public String getAceNo() {
		return aceNo;
	}
	public void setAceNo(String aceNo) {
		this.aceNo = aceNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employee(String aceNo, String name, Date doj, Date dob) {
		super();
		this.aceNo = aceNo;
		this.name = name;
		this.doj = doj;
		this.dob = dob;
	}
	public Employee() {
		super();
	}
	
	
}
