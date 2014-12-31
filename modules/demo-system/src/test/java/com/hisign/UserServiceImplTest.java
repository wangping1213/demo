package com.hisign;

import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.apache.thrift.TException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hisign.dao.SysUserMapper;
import com.hisign.model.SysUser;
import com.hisign.service.UserServiceImpl;

/**
 * 测试UserServiceImpl类
 * @author Administrator
 *
 */
public class UserServiceImplTest extends TestCase {

	@Mock
	private SysUserMapper sysUserMapper;
	
	@InjectMocks
	@Resource
	private UserServiceImpl userService;
	
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	public void testFindSysUserListByFilterNonNull() {
		SysUser user = new SysUser();
		user.setCardId("555");
		when(sysUserMapper.selectByPrimaryKey("11")).thenReturn(user);
		try {
			user = userService.findSysUserById("11");
			assertEquals("555", user.getCardId());
		} catch (TException e) {
			fail(e.getMessage());
		}
	}
	
	
	public void testConvertDateToString() {
		Calendar c = Calendar.getInstance();
		c.set(2014, 11, 26, 11, 28, 50);//2014-12-26 11:28:50
		Date date = c.getTime();
		assertEquals("2014-12-26", DateUtil.convertDateToString("yyyy-MM-dd", date));
		assertEquals("", DateUtil.convertDateToString("yyyy-MM-dd", null));
	}
	
	public void testPrivateGetInteger() {
		Calendar c = Calendar.getInstance();
		c.set(2014, 11, 26, 11, 28, 50);//2014-12-26 11:28:50
		Date date = c.getTime();
		
		try {
            Class<DateUtil> clazz = DateUtil.class;  // 获取被测试类的反射
            Class<?>[] args = new Class<?>[]{Date.class, int.class}; // 建立参数
            Method method = clazz.getDeclaredMethod("getInteger", args); // 获取私有方法和他的参数
            method.setAccessible(true);; // 允许访问
            
            int month = (Integer) method.invoke(DateUtil.class, date, Calendar.MONTH); // 调用被测类的方法
            
            assertEquals(11, month); // 测试
        } catch (Exception e) {
            // TODO: handle exception
        }
	}

}
