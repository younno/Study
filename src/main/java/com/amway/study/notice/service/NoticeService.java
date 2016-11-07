package com.amway.study.notice.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.amway.study.notice.vo.NoticeVO;


public interface NoticeService {
	public ArrayList<NoticeVO> findNoticeList(NoticeVO vo);
	public ArrayList<HashMap<String,String>> findNoticeListAjax(NoticeVO vo);
}
	