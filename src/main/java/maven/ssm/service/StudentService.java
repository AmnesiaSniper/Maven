package maven.ssm.service;

import java.util.List;

import maven.ssm.bean.Classes;
import maven.ssm.bean.Student;

public interface StudentService {

	public Classes getStudentClasses(String stu_id);
	
	public List<Student> getStudentPage(int stupage);
	public int getPage();
}
