package com.amway.study.notice.vo;

public class NoticeVO {

	/*notice field*/
	private int decSEQ; 
	private String vchTITLE; 
	private String txtCONTENT;
	private String vchOPEN_DATE;
	private String vchCLOSE_DATE;
	private String chTYPE;
	private String chDEL_YN;
	private String vchINSERT_USER;
	private String dtINSERT_DATE;
	private String vchUPDATE_USER;
	private String dtUPDATE_DATE;
	
	//paging
	private int pageNo = 1; 
	private int totalCount = 0; 
	private int listSize = 5; 
	private int offset = 0;
	
	private String sort = "decSEQ";
	private String sortAsc = "ASC";
	//paging
	
	public NoticeVO(){}

	
	public int getDecSEQ() {
		return decSEQ;
	}


	public void setDecSEQ(int decSEQ) {
		this.decSEQ = decSEQ;
	}


	public String getVchTITLE() {
		return vchTITLE;
	}

	public void setVchTITLE(String vchTITLE) {
		this.vchTITLE = vchTITLE;
	}

	public String getTxtCONTENT() {
		return txtCONTENT;
	}

	public void setTxtCONTENT(String txtCONTENT) {
		this.txtCONTENT = txtCONTENT;
	}

	public String getVchOPEN_DATE() {
		return vchOPEN_DATE;
	}

	public void setVchOPEN_DATE(String vchOPEN_DATE) {
		this.vchOPEN_DATE = vchOPEN_DATE;
	}

	public String getVchCLOSE_DATE() {
		return vchCLOSE_DATE;
	}

	public void setVchCLOSE_DATE(String vchCLOSE_DATE) {
		this.vchCLOSE_DATE = vchCLOSE_DATE;
	}

	public String getChTYPE() {
		return chTYPE;
	}

	public void setChTYPE(String chTYPE) {
		this.chTYPE = chTYPE;
	}

	public String getChDEL_YN() {
		return chDEL_YN;
	}

	public void setChDEL_YN(String chDEL_YN) {
		this.chDEL_YN = chDEL_YN;
	}

	public String getVchINSERT_USER() {
		return vchINSERT_USER;
	}

	public void setVchINSERT_USER(String vchINSERT_USER) {
		this.vchINSERT_USER = vchINSERT_USER;
	}

	public String getDtINSERT_DATE() {
		return dtINSERT_DATE;
	}

	public void setDtINSERT_DATE(String dtINSERT_DATE) {
		this.dtINSERT_DATE = dtINSERT_DATE;
	}

	public String getVchUPDATE_USER() {
		return vchUPDATE_USER;
	}

	public void setVchUPDATE_USER(String vchUPDATE_USER) {
		this.vchUPDATE_USER = vchUPDATE_USER;
	}

	public String getDtUPDATE_DATE() {
		return dtUPDATE_DATE;
	}

	public void setDtUPDATE_DATE(String dtUPDATE_DATE) {
		this.dtUPDATE_DATE = dtUPDATE_DATE;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSortAsc() {
		return sortAsc;
	}

	public void setSortAsc(String sortAsc) {
		this.sortAsc = sortAsc;
	}

	public int getOffset() {
		try{
			return (this.pageNo-1) * this.listSize;
		}catch(Exception e){
			return 0;
		}
	}

}
