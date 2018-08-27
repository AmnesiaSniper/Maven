package maven.ssm.bean;

import java.util.List;

public class Classes {
	private int class_id;
	private String class_name;
	private String class_content;
	private List<Student> students;

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_content() {
		return class_content;
	}

	public void setClass_content(String class_content) {
		this.class_content = class_content;
	}

	public List<Student> getStudent() {
		return students;
	}

	public void setStudent(List<Student> students) {
		this.students = students;
	}

	public Classes(int class_id, String class_name, String class_content) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_content = class_content;
	}

	public Classes() {
		super();
	}

	@Override
	public String toString() {
		return "Classes [class_id=" + class_id + ", class_name=" + class_name + ", class_content=" + class_content
				+ "]";
	}

}
