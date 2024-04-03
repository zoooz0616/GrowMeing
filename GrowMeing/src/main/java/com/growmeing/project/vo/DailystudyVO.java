package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class DailystudyVO {
	private String dStudyId;
	private String studyId;
	private Date dStudyDd;
	private String dSstudyNm;
	private String dStudyContent;
	private Integer dStudyTm;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
