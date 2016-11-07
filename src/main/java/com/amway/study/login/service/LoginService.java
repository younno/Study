package com.amway.study.login.service;

import java.util.HashMap;

import com.amway.study.login.vo.LoginVO;


public interface LoginService {
	
	public LoginVO selectUserMst(LoginVO vo);
	public LoginVO selectUserMstDevice(LoginVO vo);
	public HashMap<String,String> selectUserInfo(LoginVO vo);
	
	public int updateUserMstPassword(LoginVO vo);
	public void updateUserSerialNo(LoginVO userInfo);
	
	public void insertLoginLog(LoginVO userInfo);
}
