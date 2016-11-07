package com.amway.study.notice.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.amway.study.notice.vo.NoticeVO;

@Repository
public interface NoticeDaoMapper {

	public ArrayList<NoticeVO> findNoticeList(NoticeVO vo);
	public ArrayList<HashMap<String,String>> findNoticeListAjax(NoticeVO vo);
	
}
