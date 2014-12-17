package com.hisign.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import com.hisign.dao.SysUserMapper;
import com.hisign.model.SysUser;
import com.hisign.model.SysUserExample;
import com.hisign.model.UserFilter;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService.Iface {

	@Resource
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser findSysUserById(String id) throws TException {
		// TODO Auto-generated method stub
		SysUser user = sysUserMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public List<SysUser> findSysUserListByFilter(UserFilter filter)
			throws TException {
		// TODO Auto-generated method stub
		return sysUserMapper.findSysUserListByFilter(filter);
	}

	@Override
	public int findSysUserListByFilterForCount(UserFilter filter)
			throws TException {
		// TODO Auto-generated method stub
		return sysUserMapper.findSysUserListByFilterForCount(filter);
	}



}