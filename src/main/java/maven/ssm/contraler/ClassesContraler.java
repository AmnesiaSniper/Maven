package maven.ssm.contraler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import maven.ssm.bean.Classes;
import maven.ssm.bean.Student;
import maven.ssm.service.ClassesService;
import maven.ssm.util.RedisUtil;

@Controller
public class ClassesContraler {

	private ClassesService classesService;

	public ClassesService getClassesService() {
		return classesService;
	}

	@Autowired
	public void setClassesService(ClassesService classesService) {
		this.classesService = classesService;
	}

	@RequestMapping("index")
	public String index(HttpServletRequest request) {
		List<Classes> list = new ArrayList<Classes>();
		list = classesService.GetClassesList();
		System.out.println(list);
		request.setAttribute("list", list);
		return "menu";
	}

	@RequestMapping("class_student")
	public String class_student(HttpServletRequest request,String classid) {
		int id = Integer.parseInt(classid);
		System.out.println(id);
		List<Classes> class_student_list = new ArrayList<Classes>();
		class_student_list=classesService.GetClassesStudent(id);
		for (Classes c : class_student_list) {
			List<Student> st_list = c.getStudent();
			for (Student s : st_list) {
				System.out.println(s);
				request.setAttribute("st_list", st_list);
			}
		}
		return "menu";
	}
}
