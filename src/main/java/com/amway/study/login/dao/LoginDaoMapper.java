package com.amway.study.login.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.amway.study.login.vo.LoginVO;

@Repository
public interface LoginDaoMapper {

	/* select */
	public LoginVO selectUserMst(LoginVO vo);
	public LoginVO selectUserMstDevice(LoginVO vo);
	public HashMap<String,String> selectUserInfo(LoginVO vo);
	/* check */
	
	/* insert */
	/* update */
	public int updateUserMstPassword(LoginVO vo);
	public void updateUserSerialNo(LoginVO userInfo);
	/* delete */
	public void insertLoginLog(LoginVO userInfo);
}
