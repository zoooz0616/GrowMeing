package com.growmeing.project.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GroupcodeVO {
	private String grcdId;
	private String grcdNm;
	private String grcdUseYn;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
