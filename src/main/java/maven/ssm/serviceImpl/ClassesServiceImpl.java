package maven.ssm.serviceImpl;

import java.util.List;

import maven.ssm.bean.Classes;
import maven.ssm.dao.ClassesDao;
import maven.ssm.service.ClassesService;

public class ClassesServiceImpl implements ClassesService {

	private ClassesDao classesDao;

	public ClassesDao getClassesDao() {
		return classesDao;
	}

	public void setClassesDao(ClassesDao classesDao) {
		this.classesDao = classesDao;
	}

	@Override
	public List<Classes> GetClassesList() {
		// TODO Auto-generated method stub
		return classesDao.GetClassesList();
	}

	@Override
	public List<Classes> GetClassesStudent(int class_id) {
		// TODO Auto-generated method stub
		return classesDao.GetClassesStudent(class_id);
	}

}
