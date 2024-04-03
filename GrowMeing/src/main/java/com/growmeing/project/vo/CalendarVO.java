package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class CalendarVO {
	private String calId;
	private String usrId;
	private String calNm;
	private String calCategoryCd;
	private Date cal_StartDd;
	private Date calEndDd;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
