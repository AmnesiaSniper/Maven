package maven.ssm.bean;

import java.util.Date;

public class Student {
	private String stu_id;
	private String stu_name;
	private char stu_sex;
	private int stu_age;
	private Date stu_birthday;
	private int stu_class;
	private Classes classes;
	
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public char getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(char stu_sex) {
		this.stu_sex = stu_sex;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}
	public Date getStu_birthday() {
		return stu_birthday;
	}
	public void setStu_birthday(Date stu_birthday) {
		this.stu_birthday = stu_birthday;
	}
	public int getStu_class() {
		return stu_class;
	}
	public void setStu_class(int stu_class) {
		this.stu_class = stu_class;
	}
	public Student(String stu_id, String stu_name, char stu_sex, int stu_age, Date stu_birthday, int stu_class) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_age = stu_age;
		this.stu_birthday = stu_birthday;
		this.stu_class = stu_class;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex + ", stu_age=" + stu_age
				+ ", stu_birthday=" + stu_birthday + ", stu_class=" + stu_class + "]";
	}

}
