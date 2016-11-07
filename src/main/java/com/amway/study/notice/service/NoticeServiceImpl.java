package com.amway.study.notice.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amway.study.notice.dao.NoticeDaoMapper;
import com.amway.study.notice.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDaoMapper noticeDao;
	
	@Override
	public ArrayList<NoticeVO> findNoticeList(NoticeVO vo){
		return noticeDao.findNoticeList(vo);
	}
	
	@Override
	public ArrayList<HashMap<String,String>> findNoticeListAjax(NoticeVO vo){
		return noticeDao.findNoticeListAjax(vo);
	}
}
