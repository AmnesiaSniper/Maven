package maven.ssm.serviceImpl;

import java.util.List;

import maven.ssm.bean.Teacher;
import maven.ssm.dao.TeacherDao;
import maven.ssm.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public List<Teacher> getTeacherList() {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherList();
	}

}
