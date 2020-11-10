package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

/**
 * AbstractBnfcVO entity - Base definition for BnfcVO and BnfAppcVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public abstract class AbstractBnfcVO implements java.io.Serializable {

	// Fields

	/** */
	private String CPkId;
	/** */
	private String CAppNo;
	/** */
	private String CPlyNo;
	/** */
	private String CEdrNo;
	/** */
	private Long NSeqNo;
	/** */
	private Long NEdrPrjNo;
	private String CBnfcCde;
	/** */
	private String CBnfcNme;
	/** */
	private String CLatestMrk;
	private String CInsuredCde;
	/** */
	private String CRelCde;
	/** */
	private String CBenfOrd;
	/** */
	private Double NBenfProp;
	/** */
	private String CCertfCls;
	/** */
	private String CCertfCde;
	/** */
	private String CSex;
	/** */
	private Date TBirthday;
	/** */
	private String CClntMrk;
	/** */
	private String CCusLvl;
	/** */
	private String CStkMrk;
	/** */
	private String CCntrNme;
	/** */
	private String CTel;
	/** */
	private String CMobile;
	/** */
	private String CCountry;
	/** */
	private String CProvince;
	/** */
	private String CCity;
	/** */
	private String CCounty;
	/** */
	private String CSuffixAddr;
	/** */
	private String CAddr;
	/** */
	private String CZipCde;
	/** */
	private String CEmail;
	/** */
	private String CCrtCde;
	/** */
	private Date TCrtTm;
	/** */
	private String CUpdCde;
	/** */
	private Date TUpdTm;
	/** */
	private String CRowId;

	private String CResvTxt1;

	private Double NAge;

	public Double getNAge() {
		return NAge;
	}

	public void setNAge(Double nAge) {
		NAge = nAge;
	}

	public String getCResvTxt1() {
		return this.CResvTxt1;
	}

	public void setCResvTxt1(String CResvTxt1) {
		this.CResvTxt1 = CResvTxt1;
	}

	/** default constructor */
	public AbstractBnfcVO() {
	}

	// Property accessors

	public String getCPkId() {
		return this.CPkId;
	}

	public void setCPkId(String CPkId) {
		this.CPkId = CPkId;
	}

	public String getCAppNo() {
		return this.CAppNo;
	}

	public void setCAppNo(String CAppNo) {
		this.CAppNo = CAppNo;
	}

	public String getCPlyNo() {
		return this.CPlyNo;
	}

	public void setCPlyNo(String CPlyNo) {
		this.CPlyNo = CPlyNo;
	}

	public String getCEdrNo() {
		return this.CEdrNo;
	}

	public void setCEdrNo(String CEdrNo) {
		this.CEdrNo = CEdrNo;
	}

	public Long getNSeqNo() {
		return this.NSeqNo;
	}

	public void setNSeqNo(Long NSeqNo) {
		this.NSeqNo = NSeqNo;
	}

	public String getCBnfcCde() {
		return this.CBnfcCde;
	}

	public void setCBnfcCde(String CBnfcCde) {
		this.CBnfcCde = CBnfcCde;
	}

	public String getCBnfcNme() {
		return this.CBnfcNme;
	}

	public void setCBnfcNme(String CBnfcNme) {
		this.CBnfcNme = CBnfcNme;
	}

	public String getCInsuredCde() {
		return this.CInsuredCde;
	}

	public void setCInsuredCde(String CInsuredCde) {
		this.CInsuredCde = CInsuredCde;
	}

	public String getCRelCde() {
		return this.CRelCde;
	}

	public void setCRelCde(String CRelCde) {
		this.CRelCde = CRelCde;
	}

	public String getCBenfOrd() {
		return this.CBenfOrd;
	}

	public void setCBenfOrd(String CBenfOrd) {
		this.CBenfOrd = CBenfOrd;
	}

	public Double getNBenfProp() {
		return this.NBenfProp;
	}

	public void setNBenfProp(Double NBenfProp) {
		this.NBenfProp = NBenfProp;
	}

	public String getCCertfCls() {
		return this.CCertfCls;
	}

	public void setCCertfCls(String CCertTyp) {
		this.CCertfCls = CCertTyp;
	}

	public String getCCertfCde() {
		return this.CCertfCde;
	}

	public void setCCertfCde(String CCertNo) {
		this.CCertfCde = CCertNo;
	}

	public String getCSex() {
		return this.CSex;
	}

	public void setCSex(String CGenderCde) {
		this.CSex = CGenderCde;
	}

	public Date getTBirthday() {
		return this.TBirthday;
	}

	public void setTBirthday(Date TBirthDate) {
		this.TBirthday = TBirthDate;
	}

	public String getCClntMrk() {
		return this.CClntMrk;
	}

	public void setCClntMrk(String CCusTyp) {
		this.CClntMrk = CCusTyp;
	}

	public String getCCusLvl() {
		return this.CCusLvl;
	}

	public void setCCusLvl(String CCusClsCde) {
		this.CCusLvl = CCusClsCde;
	}

	public String getCStkMrk() {
		return this.CStkMrk;
	}

	public void setCStkMrk(String CShhMrk) {
		this.CStkMrk = CShhMrk;
	}

	public String getCCntrNme() {
		return this.CCntrNme;
	}

	public void setCCntrNme(String CCntrNme) {
		this.CCntrNme = CCntrNme;
	}

	public String getCTel() {
		return this.CTel;
	}

	public void setCTel(String CTel) {
		this.CTel = CTel;
	}

	public String getCMobile() {
		return this.CMobile;
	}

	public void setCMobile(String CMobile) {
		this.CMobile = CMobile;
	}

	public String getCAddr() {
		return this.CAddr;
	}

	public void setCAddr(String CAddr) {
		this.CAddr = CAddr;
	}

	public String getCZipCde() {
		return this.CZipCde;
	}

	public void setCZipCde(String CZip) {
		this.CZipCde = CZip;
	}

	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	public String getCCrtCde() {
		return this.CCrtCde;
	}

	public void setCCrtCde(String CCrtCde) {
		this.CCrtCde = CCrtCde;
	}

	public Date getTCrtTm() {
		return this.TCrtTm;
	}

	public void setTCrtTm(Date TCrtTm) {
		this.TCrtTm = TCrtTm;
	}

	public String getCUpdCde() {
		return this.CUpdCde;
	}

	public void setCUpdCde(String CUpdCde) {
		this.CUpdCde = CUpdCde;
	}

	public Date getTUpdTm() {
		return this.TUpdTm;
	}

	public void setTUpdTm(Date TUpdTm) {
		this.TUpdTm = TUpdTm;
	}

	public Long getNEdrPrjNo() {
		return NEdrPrjNo;
	}

	public void setNEdrPrjNo(Long edrPrjNo) {
		NEdrPrjNo = edrPrjNo;
	}

	public String getCLatestMrk() {
		return CLatestMrk;
	}

	public void setCLatestMrk(String latestMrk) {
		CLatestMrk = latestMrk;
	}

	public String getCCountry() {
		return CCountry;
	}

	public void setCCountry(String country) {
		CCountry = country;
	}

	public String getCProvince() {
		return CProvince;
	}

	public void setCProvince(String province) {
		CProvince = province;
	}

	public String getCCity() {
		return CCity;
	}

	public void setCCity(String city) {
		CCity = city;
	}

	public String getCCounty() {
		return CCounty;
	}

	public void setCCounty(String county) {
		CCounty = county;
	}

	public String getCSuffixAddr() {
		return CSuffixAddr;
	}

	public void setCSuffixAddr(String suffixAddr) {
		CSuffixAddr = suffixAddr;
	}

	public String getCRowId() {
		return CRowId;
	}

	public void setCRowId(String rowId) {
		CRowId = rowId;
	}

}