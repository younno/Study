package com.amway.study.login.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amway.study.login.dao.LoginDaoMapper;
import com.amway.study.login.vo.LoginVO;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDaoMapper loginDao;

	/* select */
	@Override
	public LoginVO selectUserMst(LoginVO vo) {
		// TODO Auto-generated method stub
		return loginDao.selectUserMst(vo);
	}
	
	@Override
	public HashMap<String,String> selectUserInfo(LoginVO vo){
		return loginDao.selectUserInfo(vo);
	}
	
	@Override
	public LoginVO selectUserMstDevice(LoginVO vo) {
		// TODO Auto-generated method stub
		return loginDao.selectUserMstDevice(vo);
	}
	
	/* check */
	
	
	/* insert */
	
	/* update */
	@Override
	@Transactional
	public int updateUserMstPassword(LoginVO vo){
		return loginDao.updateUserMstPassword(vo);
	}
	
	@Override
	public void updateUserSerialNo(LoginVO userInfo) {
		// TODO Auto-generated method stub
		loginDao.updateUserSerialNo(userInfo);
	}
	/* delete */

	@Override
	public void insertLoginLog(LoginVO userInfo) {
		// TODO Auto-generated method stub
		loginDao.insertLoginLog(userInfo);
	}
}
