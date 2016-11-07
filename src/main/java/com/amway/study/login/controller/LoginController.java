package com.amway.study.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amway.study.login.service.LoginService;
import com.amway.study.login.vo.LoginVO;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login")
	public String goLogin(@ModelAttribute("bean")LoginVO vo, Model model){
		model.addAttribute("vo",vo);
		return "login/login";
	}
	
	@RequestMapping(value="/logOut", method=RequestMethod.GET)
	public String goLogOut(HttpSession session, @ModelAttribute("bean")LoginVO vo, Model model){
		session.invalidate();
		return "login/login";
	}
	
	@RequestMapping(value="/goHome", method=RequestMethod.GET)
	public String goHome(HttpSession session, @ModelAttribute("bean")LoginVO vo, Model model){
		if(session.getAttribute("userInfo") != null) {
			return "login/loginHome";
		}else {
			return "login/loginGuest";
		}
	}
	
	@RequestMapping(value="/login/proc", method=RequestMethod.POST)
	public String loginProc(HttpSession session, @ModelAttribute("bean")LoginVO vo, Model model){
		
		
		LoginVO userInfo = new LoginVO();
		userInfo = loginService.selectUserMst(vo);
		
		if(userInfo != null && !userInfo.getVchUSER_ID().equals("")) {

			session.setAttribute("userInfo", loginService.selectUserInfo(vo));
			
			return "login/loginHome";
		}else {
			model.addAttribute("vo", vo);
			model.addAttribute("ERR_MSG", "ID/비밀번호를 확인하시기 바랍니다.");
			return "login/login";
		}
	}
	
}
