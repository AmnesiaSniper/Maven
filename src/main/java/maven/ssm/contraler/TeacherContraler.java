package maven.ssm.contraler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import maven.ssm.bean.Teacher;
import maven.ssm.service.TeacherService;
import maven.ssm.util.RedisUtil;

@Controller
public class TeacherContraler {

	private TeacherService teacherService;

	public TeacherService getTeacherService() {
		return teacherService;
	}

	@Autowired
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@RequestMapping("Test")
	public String Test(HttpServletRequest request) {
		List<Teacher> list = new ArrayList<Teacher>();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-redis.xml");
		RedisUtil redisUtil = (RedisUtil) context.getBean("redisUtil");
		String s = null;
		if (!redisUtil.hasKey("Tea")) {
			list = teacherService.getTeacherList();
			for (Teacher t : list) {
				System.out.println(t);
			}
			// java对象转换成json字符串
			s = redisUtil.JsonObject(list.get(0));
			System.out.println(s);
			// 存入redis
			System.out.println(redisUtil.Object("Tea", s));
			// json字符串转换成java对象
			Object obj = redisUtil.JavaObject(s, new Teacher());
			System.out.println("数据库："+obj.toString());

		} else {
			//redis存在直接取对象
			Object obj = redisUtil.sGet("Tea");
			System.out.println("redis："+obj);
		}
		
		return "menu";
	}

}
