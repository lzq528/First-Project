package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;

public class AppTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDao ud = ac.getBean(IUserDao.class);
		User user = new User();
		user.setUname("bbb");
		user.setUpwd("222");
		ud.save(user);
	}

}
