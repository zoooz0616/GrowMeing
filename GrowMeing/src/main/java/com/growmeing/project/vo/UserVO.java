package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class UserVO {
	private String usrId;
	private String usrEmail;
	private String usrPwd;
	private String usrNm;
	private Date usrBirthDd;
	private String usrTel;
	private String usrNickNm;
	private String usrJobCd;
	private String usrGenderCd;
	private Integer usrScore;
	private String usrLevelCd;
	private String usrAccountCd;
	private Timestamp usrJoinDt;
	
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
