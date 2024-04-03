package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class ProjectVO {
	private String prjtId;
	private String usrId;
	private String prjtType;
	private String prjtNm;
	private String prjtContent;
	private Date prjtStartDd;
	private Date prjtEndDd;
	private String prjtRole;
	private String prjtTool;
	private String prjtLang;
	private String prjtCd;
	private String prjtEtc;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
