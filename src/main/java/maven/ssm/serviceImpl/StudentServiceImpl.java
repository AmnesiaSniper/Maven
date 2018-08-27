package maven.ssm.serviceImpl;

import java.util.List;

import maven.ssm.bean.Classes;
import maven.ssm.bean.Student;
import maven.ssm.dao.StudentDao;
import maven.ssm.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Classes getStudentClasses(String stu_id) {
		return studentDao.getStudentClasses(stu_id);
	}

	@Override
	public List<Student> getStudentPage(int stupage) {
		return studentDao.getStudentPage(stupage);
	}

	@Override
	public int getPage() {
		return studentDao.getPage();
	}

}
