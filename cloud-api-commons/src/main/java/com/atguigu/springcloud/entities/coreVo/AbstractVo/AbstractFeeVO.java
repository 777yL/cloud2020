package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

public class AbstractFeeVO {
	private String CPkId;
	private String CAppNo;
	private String CRowId;
	private String CFeetypCde;
	private Double NFeeProp;
	private Double NFee;
	private Double NGotPrm;
	private String CCrtCde;
	private Date TCrtTm;
	private String CUpdCde;
	private Date TUpdTm;
	private Double NUpdFeeProp;
	private Double NUpdFee;
	private String CFeeFlag;


	public String getCPkId() {
		return CPkId;
	}
	public void setCPkId(String pkId) {
		CPkId = pkId;
	}
	public String getCAppNo() {
		return CAppNo;
	}
	public void setCAppNo(String appNo) {
		CAppNo = appNo;
	}
	public String getCRowId() {
		return CRowId;
	}
	public void setCRowId(String rowId) {
		CRowId = rowId;
	}
	public String getCFeetypCde() {
		return CFeetypCde;
	}
	public void setCFeetypCde(String feetypCde) {
		CFeetypCde = feetypCde;
	}
	public Double getNFeeProp() {
		return NFeeProp;
		//return new Double(((int)(NFeeProp*1000000+0.5))/1000000); //格式化数据
	}
	public void setNFeeProp(Double feeProp) {
		NFeeProp = feeProp;
		//NFeeProp = new Double(((int)(feeProp*1000000+0.5))/1000000); //格式化数据
	}
	public Double getNFee() {
		return NFee;
		//return new Double(((int)(NFee*100+0.5))/100); //格式化数据
	}
	public void setNFee(Double fee) {
		NFee = fee;
		//NFee = new Double(((int)(fee*100+0.5))/100); //格式化数据
	}
	public Double getNGotPrm() {
		return NGotPrm;
	}
	public void setNGotPrm(Double gotPrm) {
		NGotPrm = gotPrm;
	}
	public String getCCrtCde() {
		return CCrtCde;
	}
	public void setCCrtCde(String crtCde) {
		CCrtCde = crtCde;
	}
	public Date getTCrtTm() {
		return TCrtTm;
	}
	public void setTCrtTm(Date crtTm) {
		TCrtTm = crtTm;
	}
	public String getCUpdCde() {
		return CUpdCde;
	}
	public void setCUpdCde(String updCde) {
		CUpdCde = updCde;
	}
	public Date getTUpdTm() {
		return TUpdTm;
	}
	public void setTUpdTm(Date updTm) {
		TUpdTm = updTm;
	}
	public Double getNUpdFeeProp() {
		return NUpdFeeProp;
	}
	public void setNUpdFeeProp(Double updFeeProp) {
		NUpdFeeProp = updFeeProp;
	}
	public Double getNUpdFee() {
		return NUpdFee;
	}
	public void setNUpdFee(Double updFee) {
		NUpdFee = updFee;
	}
	public String getCFeeFlag() {
		return CFeeFlag;
	}
	public void setCFeeFlag(String feeFlag) {
		CFeeFlag = feeFlag;
	}


}
