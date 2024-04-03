package com.growmeing.project.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class GithubVO {
	private String gitId;
	private String usrId;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
