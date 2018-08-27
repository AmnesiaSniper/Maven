package maven.ssm.dao;

import java.util.List;

import maven.ssm.bean.Classes;
import maven.ssm.bean.Student;

public interface StudentDao {
	//通过学生ID获取对应班级（多对一）
	public Classes getStudentClasses(String stu_id);
	//分页
	public List<Student> getStudentPage(int stupage);
	public int getPage();
}
