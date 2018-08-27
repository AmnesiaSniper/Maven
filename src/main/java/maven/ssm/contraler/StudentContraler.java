package maven.ssm.contraler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import maven.ssm.bean.Classes;
import maven.ssm.bean.Student;
import maven.ssm.service.StudentService;

@Controller
public class StudentContraler {

	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	@RequestMapping("getClasserbyStudent")
	public String getClasserbyStudent(HttpServletRequest request,String stu_id){
		System.out.println(stu_id);
		Classes studentClasses = studentService.getStudentClasses(stu_id);
		System.out.println(studentClasses);
		return "index";
	}
	
	@RequestMapping("getStudentPage")
	public String getStudentPage(HttpServletRequest request,int pageItem){
		int stupage=pageItem*3;
		System.out.println("从第"+stupage+"条数据开始");
		//获取总数
		int page = studentService.getPage();
		System.out.println("总数："+page);
		int minpage,maxpage;
		if (page<=3) {
			minpage=0;
			maxpage=0;
		} else {
			if (page%3==0) {
				minpage=0;
				maxpage=page/3-1;
			} else {
				minpage=0;
				maxpage=page/3;
			}
		}	
		if (pageItem<minpage) {
			stupage = minpage*3;
		}
		if (pageItem>maxpage) {
			stupage = maxpage*3;
		}
		
		System.out.println(stupage);
		List<Student> stuList = new ArrayList<Student>();	
			stuList = studentService.getStudentPage(stupage);
		request.setAttribute("stuList", stuList);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("minpage", minpage);
		request.setAttribute("pageItem", pageItem);
		return "page";
	}
}
