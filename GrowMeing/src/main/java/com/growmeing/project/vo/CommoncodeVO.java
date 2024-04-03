package com.growmeing.project.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CommoncodeVO {
	private String cmcdId;
	private String grcdId;
	private String cmcdNm;
	private String cmcdUseYn;
	private Integer cmcdOrder;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
