package maven.ssm.service;

import java.util.List;

import maven.ssm.bean.Classes;

public interface ClassesService {

	// 获取班级༶
	public List<Classes> GetClassesList();

	// 通过班级ID获取班级学生信息（一对多）
	public List<Classes> GetClassesStudent(int class_id);

}
