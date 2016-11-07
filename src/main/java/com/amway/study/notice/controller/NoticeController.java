package com.amway.study.notice.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amway.study.notice.service.NoticeService;
import com.amway.study.notice.vo.NoticeVO;


@Controller
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	@RequestMapping(value="/notice/noticeList", method=RequestMethod.POST)
	public String findNoticeList(@ModelAttribute("bean")NoticeVO vo, Model model){
		vo = new NoticeVO();	
		ArrayList<NoticeVO> result = noticeService.findNoticeList(vo);
		model.addAttribute("list", result);
		return "notice/noticeList";
	}
	
	@RequestMapping(value="/notice/ajax/noticeList", method=RequestMethod.GET)
	@ResponseBody
	public ArrayList<HashMap<String,String>> findNoticeListAjax(
												@RequestParam("type")int type,
												@RequestParam(value="pageNo", defaultValue="1")int pageNo,
												@RequestParam(value="seq", defaultValue="0")int seq){
		NoticeVO vo = new NoticeVO();
		vo.setPageNo(pageNo);
		switch(type){
			case 1 : vo.setChTYPE("1"); break; 
		}
		if(seq > 0) {
			vo.setDecSEQ(seq);
		}
		System.out.println("seq = " + seq);
		System.out.println("decSEQ = " + vo.getDecSEQ());
		ArrayList<HashMap<String,String>> list = noticeService.findNoticeListAjax(vo);
		return list;
	}
	
}
