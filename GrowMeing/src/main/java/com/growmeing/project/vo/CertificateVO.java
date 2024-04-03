package com.growmeing.project.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class CertificateVO {
	private String certId;
	private String usrId;
	private String certTypeCd;
	private String certNm;
	private String certCd;
	private Date certTestDd;
	private Date certEffectDd;
	private Date certExpireDd;
	private String certAuthority;
	
	private Timestamp rgstDt;
	private String rgster;
	private Timestamp updtDt;
	private String updter;
	private String deleteYn;
}
