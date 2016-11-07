package com.amway.study.login.vo;

public class LoginVO {

	/* User Master*/
	private String vchUSER_ID;
	private String vchUSER_NM;
	private String vchPASSWORD;
	private String chTEMP_ACCOUNT_YN;
	private String vchSerialNo;
	private String vchEMAIL;
	private String chHP;
	private String vchOPT1_CD;
	private String dtOPT1_DT;
	private String vchOPT2_CD;
	private String dtOPT2_DT;
	private String vchOPT3_CD;
	private String dtOPT3_DT;
	private String vchINSERT_USER;
	private String dtINSERT_DT;
	private String vchUPDATE_USER;
	private String dtUPDATE_DT;
	private String chLOGIN_TYPE;
	private String LOGIN_AUTO;
	
	/* Cusom Field*/
	private String encodeId;
	
	//paging
	private int pageNo = 1; 
	private int totalCount = 0; 
	private int listSize = 5; 
	
	private String sort = "vchUSER_ID";
	private String sortAsc = "ASC";
	//paging
	
	public LoginVO(){}

	public String getVchUSER_ID() {
		return vchUSER_ID;
	}

	public void setVchUSER_ID(String vchUSER_ID) {
		this.vchUSER_ID = vchUSER_ID;
	}

	public String getVchUSER_NM() {
		return vchUSER_NM;
	}

	public void setVchUSER_NM(String vchUSER_NM) {
		this.vchUSER_NM = vchUSER_NM;
	}

	public String getVchPASSWORD() {
		return vchPASSWORD;
	}

	public void setVchPASSWORD(String vchPASSWORD) {
		this.vchPASSWORD = vchPASSWORD;
	}

	public String getChTEMP_ACCOUNT_YN() {
		return chTEMP_ACCOUNT_YN;
	}

	public void setChTEMP_ACCOUNT_YN(String chTEMP_ACCOUNT_YN) {
		this.chTEMP_ACCOUNT_YN = chTEMP_ACCOUNT_YN;
	}

	public String getVchSerialNo() {
		return vchSerialNo;
	}

	public void setVchSerialNo(String vchSerialNo) {
		this.vchSerialNo = vchSerialNo;
	}

	public String getVchEMAIL() {
		return vchEMAIL;
	}

	public void setVchEMAIL(String vchEMAIL) {
		this.vchEMAIL = vchEMAIL;
	}

	public String getChHP() {
		return chHP;
	}

	public void setChHP(String chHP) {
		this.chHP = chHP;
	}

	public String getVchOPT1_CD() {
		return vchOPT1_CD;
	}

	public void setVchOPT1_CD(String vchOPT1_CD) {
		this.vchOPT1_CD = vchOPT1_CD;
	}

	public String getDtOPT1_DT() {
		return dtOPT1_DT;
	}

	public void setDtOPT1_DT(String dtOPT1_DT) {
		this.dtOPT1_DT = dtOPT1_DT;
	}

	public String getVchOPT2_CD() {
		return vchOPT2_CD;
	}

	public void setVchOPT2_CD(String vchOPT2_CD) {
		this.vchOPT2_CD = vchOPT2_CD;
	}

	public String getDtOPT2_DT() {
		return dtOPT2_DT;
	}

	public void setDtOPT2_DT(String dtOPT2_DT) {
		this.dtOPT2_DT = dtOPT2_DT;
	}

	public String getVchOPT3_CD() {
		return vchOPT3_CD;
	}

	public void setVchOPT3_CD(String vchOPT3_CD) {
		this.vchOPT3_CD = vchOPT3_CD;
	}

	public String getDtOPT3_DT() {
		return dtOPT3_DT;
	}

	public void setDtOPT3_DT(String dtOPT3_DT) {
		this.dtOPT3_DT = dtOPT3_DT;
	}

	public String getVchINSERT_USER() {
		return vchINSERT_USER;
	}

	public void setVchINSERT_USER(String vchINSERT_USER) {
		this.vchINSERT_USER = vchINSERT_USER;
	}

	public String getDtINSERT_DT() {
		return dtINSERT_DT;
	}

	public void setDtINSERT_DT(String dtINSERT_DT) {
		this.dtINSERT_DT = dtINSERT_DT;
	}

	public String getVchUPDATE_USER() {
		return vchUPDATE_USER;
	}

	public void setVchUPDATE_USER(String vchUPDATE_USER) {
		this.vchUPDATE_USER = vchUPDATE_USER;
	}

	public String getDtUPDATE_DT() {
		return dtUPDATE_DT;
	}

	public void setDtUPDATE_DT(String dtUPDATE_DT) {
		this.dtUPDATE_DT = dtUPDATE_DT;
	}

	public String getChLOGIN_TYPE() {
		return chLOGIN_TYPE;
	}

	public void setChLOGIN_TYPE(String chLOGIN_TYPE) {
		this.chLOGIN_TYPE = chLOGIN_TYPE;
	}

	public String getLOGIN_AUTO() {
		return LOGIN_AUTO;
	}

	public void setLOGIN_AUTO(String lOGIN_AUTO) {
		LOGIN_AUTO = lOGIN_AUTO;
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

	public String getEncodeId() {
		return encodeId;
	}

	public void setEncodeId(String encodeId) {
		this.encodeId = encodeId;
	}

}
