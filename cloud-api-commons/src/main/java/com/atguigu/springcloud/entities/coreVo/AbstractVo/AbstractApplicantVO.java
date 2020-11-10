package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

/**
 * AbstractApplicantVO entity - Base definition for ApplicantVO and
 * AppApplicantVO .C
 *
 * @author jiangqf@isoftstone-ai.com
 */

public abstract class AbstractApplicantVO implements java.io.Serializable {

	// Fields

	/** */
	private String CAppNo;
	/** */
	private String CPlyNo;
	/** */
	private String CEdrNo;
	/** */
	private String CAppCde;
	/** */
	private String CAppNme;
	/** */
	private String CCertfCls;
	private Long NEdrPrjNo;
	private String CCertfCde;
	/** */
	private String CClntMrk;
	/** */
	private String CCusLvl;
	/** */
	private String CStkMrk;
	/** */
	private String CTrdCde;
	/** */
	private String CSubTrdCde;
	/** */
	private String CCntrNme;
	/** */
	private String CTel;
	/** */
	private String CMobile;
	/** */
	private String CCountry;
	/** */
	private String CProvince ;
	/** */
	private String CCity;
	/** */
	private String CCounty;
	/** */
	private String CSuffixAddr;
	/** */
	private String CClntAddr;
	/** */
	private String CLatestMrk;
	private String CZipCde;
	/** */
	private String CEmail;
	/** */
	private String CWorkDpt;
	/** */
	private String CMrgCde;
	private String CFax;
	private Double NAppSum;
	private String CAppWay;
	private Double NJobSum;
	private Double NRetSum;
	private String CWorkCtt;
	private String CAppDptNme;
	private String CWorkArea;
	private String CWebAddr;

	/** */
	private String CCrtCde;
	/** */
	private Date TCrtTm;
	/** */
	private String CUpdCde;
	/** */
	private Date TUpdTm;
	private String CCustRiskRank; //反洗钱客户风险等级


	//新增字段
	private String CResvTxt1;
	private String CResvTxt2;
	private String CResvTxt3;
	private String CRelCde;
	private String CCusRiskLvl; //客户风险等级
	private Double NResvNum1; //年龄

	//增加06大类产品的客户信息所需使用的字段
	private String CSex;//性别
	private String COccupCde;//职业代码
	private Date TBirthday;//出生日期

	private Date TCertfEndDate;//证件有效期至
	//xiongzhe
	private String CResvTxt4;
	private String CResvTxt5;
	private String CResvTxt6;
	private String CResvTxt7;
	private String CResvTxt8;
	private String CResvTxt9;
	private String CResvTxt10;
	private String CResvTxt11;
	private String CResvTxt12;
	private String CResvTxt13;

	private Double NResvNum2;
	private Double NResvNum3;
	private Double NResvNum4;
	private Double NResvNum5;
	private Double NResvNum6;
	private Double NResvNum7;
	private Double NResvNum8;

	/**激活卡系统添加字段,add by xiongzhe,2012-12-31 start*/
	private String CCntrCertfCde;//经办人身份证号码
	private Date TCntrCertfEndTm;//经办人证件有效期至
	private String CLegalNme;//法定代表人姓名
	private String CLegalCertfCde;//法人身份证号
	private Date TLegalCertfEndTm;//法定代表人证件有效期限
	/**激活卡系统添加字段,add by xiongzhe,2012-12-31 end*/
	private String CTowns;
	private String CGroup;
	// Constructors
	//add by Lvpeng 新疆反洗钱事宜新增2016-11-11 14:42:50
	private String CBusinessScope;//经营范围
	private String COperaterCertfTyp;//办理人员证件种类
	private String CNation;//国籍
	private String COccupTyp;//职业类别
	private Double  NAge;//

	private String CTeamType;	//团队类型	ADD BY LIUREN 2018-07_24

	private Date TCertfBgnDate;//NNC-20181229101-反洗钱新增字段：证件有效期起期
	private String CResvTxt32; //NNC-20181229101-反洗钱新增字段：经常居住地

	private String CUploadSign;//是否上传关联交易审批单（0-否，1-是）
	private String CRelateBusi;//关联交易标识
	private String CRelateNo;//关联交易审批单编号

	public String getCTeamType() {
		return CTeamType;
	}

	public void setCTeamType(String cTeamType) {
		CTeamType = cTeamType;
	}

	public String getCOccupTyp() {
		return COccupTyp;
	}

	public void setCOccupTyp(String cOccupTyp) {
		COccupTyp = cOccupTyp;
	}

	public String getCNation() {
		return CNation;
	}

	public void setCNation(String cNation) {
		CNation = cNation;
	}

	public String getCBusinessScope() {
		return CBusinessScope;
	}

	public void setCBusinessScope(String cBusinessScope) {
		CBusinessScope = cBusinessScope;
	}

	public String getCOperaterCertfTyp() {
		return COperaterCertfTyp;
	}

	public void setCOperaterCertfTyp(String cOperaterCertfTyp) {
		COperaterCertfTyp = cOperaterCertfTyp;
	}

	public String getCTowns() {
		return CTowns;
	}

	public void setCTowns(String cTowns) {
		CTowns = cTowns;
	}

	public String getCGroup() {
		return CGroup;
	}

	public void setCGroup(String cGroup) {
		CGroup = cGroup;
	}

	public String getCLegalNme() {
		return CLegalNme;
	}

	public void setCLegalNme(String legalNme) {
		CLegalNme = legalNme;
	}

	public String getCResvTxt4() {
		return CResvTxt4;
	}

	public void setCResvTxt4(String resvTxt4) {
		CResvTxt4 = resvTxt4;
	}

	/** default constructor */
	public AbstractApplicantVO() {
	}

	// Property accessors

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

	public String getCAppCde() {
		return this.CAppCde;
	}

	public void setCAppCde(String CAppCde) {
		this.CAppCde = CAppCde;
	}

	public String getCAppNme() {
		return this.CAppNme;
	}

	public void setCAppNme(String CAppNme) {
		this.CAppNme = CAppNme;
	}

	public String getCTrdCde() {
		return this.CTrdCde;
	}

	public void setCTrdCde(String CTrdCde) {
		this.CTrdCde = CTrdCde;
	}

	public String getCSubTrdCde() {
		return this.CSubTrdCde;
	}

	public void setCSubTrdCde(String CSubTrdCde) {
		this.CSubTrdCde = CSubTrdCde;
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



	public String getCClntAddr() {
		return CClntAddr;
	}

	public void setCClntAddr(String clntAddr) {
		CClntAddr = clntAddr;
	}

	public String getCZipCde() {
		return this.CZipCde;
	}

	public void setCZipCde(String CZipCde) {
		this.CZipCde = CZipCde;
	}

	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	public String getCWorkDpt() {
		return this.CWorkDpt;
	}

	public void setCWorkDpt(String CWorkDpt) {
		this.CWorkDpt = CWorkDpt;
	}

	public String getCMrgCde() {
		return this.CMrgCde;
	}

	public void setCMrgCde(String CMrgCde) {
		this.CMrgCde = CMrgCde;
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

	public String getCCertfCls() {
		return CCertfCls;
	}

	public void setCCertfCls(String certfCls) {
		CCertfCls = certfCls;
	}

	public String getCCertfCde() {
		return CCertfCde;
	}

	public void setCCertfCde(String certfCde) {
		CCertfCde = certfCde;
	}



	public String getCClntMrk() {
		return CClntMrk;
	}

	public void setCClntMrk(String clntMrk) {
		CClntMrk = clntMrk;
	}

	public String getCCusLvl() {
		return CCusLvl;
	}

	public void setCCusLvl(String cusLvl) {
		CCusLvl = cusLvl;
	}

	public String getCStkMrk() {
		return CStkMrk;
	}

	public void setCStkMrk(String stkMrk) {
		CStkMrk = stkMrk;
	}

	public String getCMobile() {
		return CMobile;
	}

	public void setCMobile(String mobile) {
		CMobile = mobile;
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

	public String getCFax() {
		return CFax;
	}

	public void setCFax(String fax) {
		CFax = fax;
	}

	public Double getNAppSum() {
		return NAppSum;
	}

	public void setNAppSum(Double appSum) {
		NAppSum = appSum;
	}

	public String getCAppWay() {
		return CAppWay;
	}

	public void setCAppWay(String appWay) {
		CAppWay = appWay;
	}

	public Double getNJobSum() {
		return NJobSum;
	}

	public void setNJobSum(Double jobSum) {
		NJobSum = jobSum;
	}

	public Double getNRetSum() {
		return NRetSum;
	}

	public void setNRetSum(Double retSum) {
		NRetSum = retSum;
	}

	public String getCWorkCtt() {
		return CWorkCtt;
	}

	public void setCWorkCtt(String workCtt) {
		CWorkCtt = workCtt;
	}

	public String getCAppDptNme() {
		return CAppDptNme;
	}

	public void setCAppDptNme(String appDptNme) {
		CAppDptNme = appDptNme;
	}

	public String getCWorkArea() {
		return CWorkArea;
	}

	public void setCWorkArea(String workArea) {
		CWorkArea = workArea;
	}

	public String getCWebAddr() {
		return CWebAddr;
	}

	public void setCWebAddr(String webAddr) {
		CWebAddr = webAddr;
	}

	public String getCResvTxt1() {
		return CResvTxt1;
	}

	public void setCResvTxt1(String resvTxt1) {
		CResvTxt1 = resvTxt1;
	}

	public String getCResvTxt2() {
		return CResvTxt2;
	}

	public void setCResvTxt2(String resvTxt2) {
		CResvTxt2 = resvTxt2;
	}

	public String getCRelCde() {
		return CRelCde;
	}

	public void setCRelCde(String relCde) {
		CRelCde = relCde;
	}

	public String getCCusRiskLvl() {
		return CCusRiskLvl;
	}

	public void setCCusRiskLvl(String cusRiskLvl) {
		CCusRiskLvl = cusRiskLvl;
	}

	public String getCSex() {
		return CSex;
	}

	public void setCSex(String sex) {
		CSex = sex;
	}

	public String getCOccupCde() {
		return COccupCde;
	}

	public void setCOccupCde(String occupCde) {
		COccupCde = occupCde;
	}

	public Date getTBirthday() {
		return TBirthday;
	}

	public void setTBirthday(Date birthday) {
		TBirthday = birthday;
	}

	public Date getTCertfEndDate() {
		return TCertfEndDate;
	}

	public void setTCertfEndDate(Date certfEndDate) {
		TCertfEndDate = certfEndDate;
	}

	public Double getNResvNum1() {
		return NResvNum1;
	}

	public void setNResvNum1(Double resvNum1) {
		NResvNum1 = resvNum1;
	}

	public String getCResvTxt3() {
		return CResvTxt3;
	}

	public void setCResvTxt3(String resvTxt3) {
		CResvTxt3 = resvTxt3;
	}

	public String getCCustRiskRank() {
		return CCustRiskRank;
	}

	public void setCCustRiskRank(String custRiskRank) {
		CCustRiskRank = custRiskRank;
	}

	public String getCResvTxt5() {
		return CResvTxt5;
	}

	public void setCResvTxt5(String resvTxt5) {
		CResvTxt5 = resvTxt5;
	}

	public String getCResvTxt6() {
		return CResvTxt6;
	}

	public void setCResvTxt6(String resvTxt6) {
		CResvTxt6 = resvTxt6;
	}

	public String getCResvTxt7() {
		return CResvTxt7;
	}

	public void setCResvTxt7(String resvTxt7) {
		CResvTxt7 = resvTxt7;
	}

	public String getCResvTxt8() {
		return CResvTxt8;
	}

	public void setCResvTxt8(String resvTxt8) {
		CResvTxt8 = resvTxt8;
	}

	public String getCResvTxt9() {
		return CResvTxt9;
	}

	public void setCResvTxt9(String resvTxt9) {
		CResvTxt9 = resvTxt9;
	}

	public String getCResvTxt10() {
		return CResvTxt10;
	}

	public void setCResvTxt10(String resvTxt10) {
		CResvTxt10 = resvTxt10;
	}

	public String getCResvTxt11() {
		return CResvTxt11;
	}

	public void setCResvTxt11(String resvTxt11) {
		CResvTxt11 = resvTxt11;
	}

	public String getCResvTxt12() {
		return CResvTxt12;
	}

	public void setCResvTxt12(String resvTxt12) {
		CResvTxt12 = resvTxt12;
	}

	public String getCResvTxt13() {
		return CResvTxt13;
	}

	public void setCResvTxt13(String resvTxt13) {
		CResvTxt13 = resvTxt13;
	}

	public Double getNResvNum3() {
		return NResvNum3;
	}

	public void setNResvNum3(Double resvNum3) {
		NResvNum3 = resvNum3;
	}

	public Double getNResvNum4() {
		return NResvNum4;
	}

	public void setNResvNum4(Double resvNum4) {
		NResvNum4 = resvNum4;
	}

	public Double getNResvNum5() {
		return NResvNum5;
	}

	public void setNResvNum5(Double resvNum5) {
		NResvNum5 = resvNum5;
	}

	public Double getNResvNum6() {
		return NResvNum6;
	}

	public void setNResvNum6(Double resvNum6) {
		NResvNum6 = resvNum6;
	}

	public Double getNResvNum7() {
		return NResvNum7;
	}

	public void setNResvNum7(Double resvNum7) {
		NResvNum7 = resvNum7;
	}

	public Double getNResvNum8() {
		return NResvNum8;
	}

	public void setNResvNum8(Double resvNum8) {
		NResvNum8 = resvNum8;
	}

	public Double getNResvNum2() {
		return NResvNum2;
	}

	public void setNResvNum2(Double resvNum2) {
		NResvNum2 = resvNum2;
	}

	public String getCCntrCertfCde() {
		return CCntrCertfCde;
	}

	public void setCCntrCertfCde(String cntrCertfCde) {
		CCntrCertfCde = cntrCertfCde;
	}

	public Date getTCntrCertfEndTm() {
		return TCntrCertfEndTm;
	}

	public void setTCntrCertfEndTm(Date cntrCertfEndTm) {
		TCntrCertfEndTm = cntrCertfEndTm;
	}

	public String getCLegalCertfCde() {
		return CLegalCertfCde;
	}

	public void setCLegalCertfCde(String legalCertfCde) {
		CLegalCertfCde = legalCertfCde;
	}

	public Date getTLegalCertfEndTm() {
		return TLegalCertfEndTm;
	}

	public void setTLegalCertfEndTm(Date legalCertfEndTm) {
		TLegalCertfEndTm = legalCertfEndTm;
	}

	public void setNAge(Double nAge) {
		NAge = nAge;
	}

	public Double getNAge() {
		return NAge;
	}

	public Date getTCertfBgnDate() {
		return TCertfBgnDate;
	}

	public void setTCertfBgnDate(Date tCertfBgnDate) {
		TCertfBgnDate = tCertfBgnDate;
	}

	public String getCResvTxt32() {
		return CResvTxt32;
	}

	public void setCResvTxt32(String cResvTxt32) {
		CResvTxt32 = cResvTxt32;
	}

	public String getCUploadSign() { return CUploadSign; }

	public void setCUploadSign(String cUploadSign) {
		CUploadSign = cUploadSign;
	}

	public String getCRelateBusi() {
		return CRelateBusi;
	}

	public void setCRelateBusi(String cRelateBusi) {
		CRelateBusi = cRelateBusi;
	}

	public String getCRelateNo() {
		return CRelateNo;
	}

	public void setCRelateNo(String CRelateNo) {
		this.CRelateNo = CRelateNo;
	}
}