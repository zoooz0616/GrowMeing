package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class StudyVO {
	private String studyId;
	private String usrId;
	private String studyNm;
	private String studyContent;
	private String studyCd;
	private Date studyStartDd;
	private Date studyEndDd;
	private Integer studyTotalTm;
	private String studyBookNm;
	private String studyBookAuthor;
	private String studyLecture;
	private String studyLectureUrl;
	private String studyEtc;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
