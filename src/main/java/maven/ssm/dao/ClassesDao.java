package maven.ssm.dao;

import java.util.List;

import maven.ssm.bean.Classes;

public interface ClassesDao {

	// 获取班级列表
	public List<Classes> GetClassesList();

	// 获取班级及班级学生
	public List<Classes> GetClassesStudent(int class_id);
}
