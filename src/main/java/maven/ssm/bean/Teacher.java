package maven.ssm.bean;

public class Teacher {

	private String ter_id;
	private String ter_name;
	private char ter_sex;
	private int ter_age;
	private String ter_level;
	private String ter_class;

	public String getTer_id() {
		return ter_id;
	}

	public void setTer_id(String ter_id) {
		this.ter_id = ter_id;
	}

	public String getTer_name() {
		return ter_name;
	}

	public void setTer_name(String ter_name) {
		this.ter_name = ter_name;
	}

	public char getTer_sex() {
		return ter_sex;
	}

	public void setTer_sex(char ter_sex) {
		this.ter_sex = ter_sex;
	}

	public int getTer_age() {
		return ter_age;
	}

	public void setTer_age(int ter_age) {
		this.ter_age = ter_age;
	}

	public String getTer_level() {
		return ter_level;
	}

	public void setTer_level(String ter_level) {
		this.ter_level = ter_level;
	}

	public String getTer_class() {
		return ter_class;
	}

	public void setTer_class(String ter_class) {
		this.ter_class = ter_class;
	}

	public Teacher(String ter_id, String ter_name, char ter_sex, int ter_age, String ter_level, String ter_class) {
		super();
		this.ter_id = ter_id;
		this.ter_name = ter_name;
		this.ter_sex = ter_sex;
		this.ter_age = ter_age;
		this.ter_level = ter_level;
		this.ter_class = ter_class;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [ter_id=" + ter_id + ", ter_name=" + ter_name + ", ter_sex=" + ter_sex + ", ter_age=" + ter_age
				+ ", ter_level=" + ter_level + ", ter_class=" + ter_class + "]";
	}

}
