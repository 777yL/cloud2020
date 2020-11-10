package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

/**
 * AbstractCvrgVO entity - Base definition for CvrgVO and CvrAppgVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public abstract class AbstractCvrgVO implements java.io.Serializable {

	// Fields

	/** */
	private String CPkId;
	/** */
	private String CAppNo;
	/** */
	private String CPlyNo;
	/** */
	private String CEdrNo;
	private Long NEdrPrjNo;
	/** */
	private Long NSeqNo;
	private String CLatestMrk;
	/** */
	private String CCvrgNo;
	/** */
	private String CCustCvrgNme;
	/** */
	private String CCustClCtnt;

	// 2010.11.02 修改默认值为null
	/** */
	private Double NAmt; // = 0.0
	/** */
	private Double NRate; // = 0.0
	/** */
	private Double NBasePrm;
	/** */
	private Double NBefPrm = 0.0;
	/** */
	private Double NDisCoef;
	/** */
	private Double NCalcPrm  = 0.0;
	/** */
	private Double NPrm ; // = 0.0
	/** */
	private Double NBefAnnPrm = 0.0;
	/** */
	private Double NCalcAnnPrm = 0.0;
	/** */
	private Date TPrmChgTm;
	/** */
	private Double NDutPrm;
	/** */
	private String CRemark;
	/** */
	private String CTgtTyp;
	/** */
	private String CTgtNme;
	/** */
	private Long NTgtQty;
	/** */
	private Double NIndemLmt;
	/** */
	private Double NDductRate;
	/** */
	private String CDductDesc;
	/** */
	private Double NDductAmt;
	/** */
	private String CCancelMrk;
	/** */
	private String CIndemLmtLvl;
	/** */
	private Long NLiabDaysLmt;
	/** */
	private Double NPerAmt;
	/** */
	private Double NPerIndemLmt;
	/** */
	private Double NPerPrm;
	/** */
	private Double NOnceIndemLmt;
	/** */
	private Double NSavingAmt;
	/** */
	private Date TBgnTm;
	/** */
	private Date TEndTm;
	/** */
	private Double NAmtVar = 0.0;
	/** */
	private Double NPrmVar = 0.0;
	/** */
	private Double NCalcPrmVar;
	/** */
	private Double NIndemVar;
	/** */
	private String CCrtCde;
	/** */
	private Date TCrtTm;
	/** */
	private String CUpdCde;
	/** */
	private Date TUpdTm;
	/** */
	private String CResvTxt1;
	/** */
	private String CResvTxt2;
	/** 记录核心方案出单的方案号，不允许占用*/
	private String CResvTxt3;
	/** */
	private String CResvTxt4;
	/** */
	private String CResvTxt5;
	/** */
	private String CResvTxt6;
	/** */
	private String CResvTxt7;
	/** */
	private String CResvTxt8;
	/** */
	private String CResvTxt9;
	/** */
	private String CResvTxt10;
	/** */
	private String CResvTxt11;
	/** */
	private String CResvTxt12;
	/** */
	private String CResvTxt13;
	/** */
	private String CResvTxt14;
	/** */
	private String CResvTxt15;
	/** */
	private String CResvTxt16;
	/** */
	private String CResvTxt17;
	/** */
	private String CResvTxt18;
	/** */
	private String CResvTxt19;
	/** */
	private String CResvTxt20;
	/** */
	private String CResvTxt21;
	/** */
	private String CResvTxt22;
	/** */
	private String CResvTxt23;
	/** */
	private String CResvTxt24;
	/** */
	private String CResvTxt25;
	/** */
	private String CResvTxt26;
	/** */
	private String CResvTxt27;
	/** */
	private String CResvTxt28;
	/** */
	private String CResvTxt29;
	/** */
	private String CResvTxt30;
	/** */
	private Double NResvNum1;
	/** */
	private Double NResvNum2;
	/** */
	private Double NResvNum3;
	/** */
	private Double NResvNum4;
	/** */
	private Double NResvNum5;
	/** */
	private Double NResvNum6;
	/** */
	private Double NResvNum7;
	/** */
	private Double NResvNum8;
	/** */
	private Double NResvNum9;
	/** */
	private Double NResvNum10;
	/** */
	private Double NResvNum11;
	/** */
	private Double NResvNum12;
	/** */
	private Double NResvNum13;
	/** */
	private Double NResvNum14;
	/** */
	private Double NResvNum15;
	/** */
	private Double NResvNum16;
	/** */
	private Double NResvNum17;
	/** */
	private Double NResvNum18;
	/** */
	private Double NResvNum19;
	/** */
	private Double NResvNum20;
	/** */
	private Double NResvNum21;
	/** */
	private Double NResvNum22;
	/** */
	private Double NResvNum23;
	/** */
	private Double NResvNum24;
	/** */
	private Double NResvNum25;
	/** */
	private Double NResvNum26;
	/** */
	private Double NResvNum27;
	/** */
	private Double NResvNum28;
	/** */
	private Double NResvNum29;
	/** */
	private Double NResvNum30;
	/** */
	private Double NFloatRate;
	/** */
	private Date TResvTm1;
	/** */
	private Date TResvTm2;
	/** */
	private Date TResvTm3;
	/** */
	private Date TResvTm4;
	/** */
	private Date TResvTm5;
	/** */
	private String CDductMrk;
	/** */
	private String CRowId;

	/********一家新团单模式添加字段 Begin**********/
	private String CPlanNo;
	private Long NExemPeriod;
	/**
	 * 是否高风险项目
	 */
	private String CTgtTxtFld17;
	/**
	 * 高风险项目
	 */
	private String CTgtTxtFld18;
	/********一家新团单模式添加字段 End**********/
	private Double NDductPrm;
	private String CUnderInsuranceFlag;
	// Constructors
	private String CFormula;//add by hanxifeng 2012.08.06 保费计算过程
	private Double NCompenRate; //赔付比例

	private Double NNotaxPrm;//不含税保费
	private Double NAddedTax;//增值税额
	private Double NNotaxPrmVar;//不含税保费变化值
	private Double NAddedTaxVar;//增值税额变化值
	private Double NTaxRate;//税率
	
	private String CTermNo; // 条款主键
	private String CTermUrl; // 条款地址
	
	private Double NNetPrm;//再保净保费
    private Double NNetPrmVar;//再保净保费变化量
	//2019.11.14 add by wj 新增字段 YAIC 健康险意外险类型01意外险02健康险
	private  String CCvrgTypFlag;
	// 健康险八大类
	private  String CHealthType;
	// 对应财务科目
	private  String CFinCde;
	
	/**
     * 研发版本新增字段
     * 主附险标志
     */
    private String CType;
	
    /**
     * 研发版本新增字段
     * 险别别名 
     */
    private String CAliasNme;
    
    /**
     * 新增字段
     * 险别对应的单条款产品编号
     */
    private String CRealProdNo;
    
    /**
     * 新增字段（迁移）
     * 职业类别
     */
    private String COccupTyp;
    
    /**
     * 新增字段（迁移）
     * 投保份数/约定倍数
     */
    private Double NAppCopies;
    
    /**
     * 新增字段（迁移）
     * 每日津贴
     */
    private Double NDailyAllowance;
	
	private String CGroupId; //2019.11.7 add by pflir 新增字段 YAIC 险别分组ID
	/** 共享保额标志 0否，1是 */
	private String CShareAmtMark;
	/** 共享保额实际算费人数 */
	private Long NShareAmtPeopleNum;
	
	public String getCGroupId() {
		return CGroupId;
	}

	public void setCGroupId(String cGroupId) {
		CGroupId = cGroupId;
	}

	public String getCTgtTxtFld17() {
		return CTgtTxtFld17;
	}

	public void setCTgtTxtFld17(String CTgtTxtFld17) {
		this.CTgtTxtFld17 = CTgtTxtFld17;
	}

	public String getCTgtTxtFld18() {
		return CTgtTxtFld18;
	}

	public void setCTgtTxtFld18(String CTgtTxtFld18) {
		this.CTgtTxtFld18 = CTgtTxtFld18;
	}

	public Double getNNotaxPrm() {
		return NNotaxPrm;
	}

	public void setNNotaxPrm(Double nNotaxPrm) {
		NNotaxPrm = nNotaxPrm;
	}

	public Double getNAddedTax() {
		return NAddedTax;
	}

	public void setNAddedTax(Double nAddedTax) {
		NAddedTax = nAddedTax;
	}

	public Double getNNotaxPrmVar() {
		return NNotaxPrmVar;
	}

	public void setNNotaxPrmVar(Double nNotaxPrmVar) {
		NNotaxPrmVar = nNotaxPrmVar;
	}

	public Double getNAddedTaxVar() {
		return NAddedTaxVar;
	}

	public void setNAddedTaxVar(Double nAddedTaxVar) {
		NAddedTaxVar = nAddedTaxVar;
	}

	public Double getNTaxRate() {
		return NTaxRate;
	}

	public void setNTaxRate(Double nTaxRate) {
		NTaxRate = nTaxRate;
	}

	public String getCFormula() {
		return CFormula;
	}

	public void setCFormula(String formula) {
		CFormula = formula;
	}

	public Double getNDductPrm() {
		return NDductPrm;
	}

	public void setNDductPrm(Double dductPrm) {
		NDductPrm = dductPrm;
	}

	public String getCPlanNo() {
		return CPlanNo;
	}

	public Long getNExemPeriod() {
		return NExemPeriod;
	}

	public void setCPlanNo(String planNo) {
		CPlanNo = planNo;
	}

	public void setNExemPeriod(Long exemPeriod) {
		NExemPeriod = exemPeriod;
	}

	/** default constructor */
	public AbstractCvrgVO() {
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

	public String getCCvrgNo() {
		return this.CCvrgNo;
	}

	public void setCCvrgNo(String CCvrgNo) {
		this.CCvrgNo = CCvrgNo;
	}

	public String getCCustCvrgNme() {
		return this.CCustCvrgNme;
	}

	public void setCCustCvrgNme(String CCustCvrgNme) {
		this.CCustCvrgNme = CCustCvrgNme;
	}

	public String getCCustClCtnt() {
		return this.CCustClCtnt;
	}

	public void setCCustClCtnt(String CCustClCtnt) {
		this.CCustClCtnt = CCustClCtnt;
	}

	public Double getNAmt() {
		return this.NAmt;
	}

	public void setNAmt(Double NAmt) {
		this.NAmt = NAmt;
	}

	public Double getNRate() {
		return this.NRate;
	}

	public void setNRate(Double NRate) {
		this.NRate = NRate;
	}

	public Double getNBasePrm() {
		return this.NBasePrm;
	}

	public void setNBasePrm(Double NBasePrm) {
		this.NBasePrm = NBasePrm;
	}

	public Double getNBefPrm() {
		return this.NBefPrm;
	}

	public void setNBefPrm(Double NBefPrm) {
		this.NBefPrm = NBefPrm;
	}

	public Double getNDisCoef() {
		return this.NDisCoef;
	}

	public void setNDisCoef(Double NDisCoef) {
		this.NDisCoef = NDisCoef;
	}

	public Double getNCalcPrm() {
		return this.NCalcPrm;
	}

	public void setNCalcPrm(Double NCalcPrm) {
		this.NCalcPrm = NCalcPrm;
	}

	public Double getNPrm() {
		return this.NPrm;
	}

	public void setNPrm(Double NPrm) {
		this.NPrm = NPrm;
	}

	public Double getNBefAnnPrm() {
		return this.NBefAnnPrm;
	}

	public void setNBefAnnPrm(Double NBefAnnPrm) {
		this.NBefAnnPrm = NBefAnnPrm;
	}

	public Double getNCalcAnnPrm() {
		return this.NCalcAnnPrm;
	}

	public void setNCalcAnnPrm(Double NCalcAnnPrm) {
		this.NCalcAnnPrm = NCalcAnnPrm;
	}

	public Date getTPrmChgTm() {
		return this.TPrmChgTm;
	}

	public void setTPrmChgTm(Date TPrmChgTm) {
		this.TPrmChgTm = TPrmChgTm;
	}

	public Double getNDutPrm() {
		return this.NDutPrm;
	}

	public void setNDutPrm(Double NDutPrm) {
		this.NDutPrm = NDutPrm;
	}

	public String getCRemark() {
		return this.CRemark;
	}

	public void setCRemark(String CRemark) {
		this.CRemark = CRemark;
	}

	public String getCTgtTyp() {
		return this.CTgtTyp;
	}

	public void setCTgtTyp(String CTgtTyp) {
		this.CTgtTyp = CTgtTyp;
	}

	public String getCTgtNme() {
		return this.CTgtNme;
	}

	public void setCTgtNme(String CTgtNme) {
		this.CTgtNme = CTgtNme;
	}

	public Long getNTgtQty() {
		return this.NTgtQty;
	}

	public void setNTgtQty(Long NTgtQty) {
		this.NTgtQty = NTgtQty;
	}

	public Double getNIndemLmt() {
		return this.NIndemLmt;
	}

	public void setNIndemLmt(Double NIndemLmt) {
		this.NIndemLmt = NIndemLmt;
	}

	public Double getNDductRate() {
		return this.NDductRate;
	}

	public void setNDductRate(Double NDductRate) {
		this.NDductRate = NDductRate;
	}

	public String getCDductDesc() {
		return this.CDductDesc;
	}

	public void setCDductDesc(String CDductDesc) {
		this.CDductDesc = CDductDesc;
	}

	public Double getNDductAmt() {
		return this.NDductAmt;
	}

	public void setNDductAmt(Double NDductAmt) {
		this.NDductAmt = NDductAmt;
	}

	public String getCCancelMrk() {
		return this.CCancelMrk;
	}

	public void setCCancelMrk(String CCancelMrk) {
		this.CCancelMrk = CCancelMrk;
	}

	public String getCIndemLmtLvl() {
		return this.CIndemLmtLvl;
	}

	public void setCIndemLmtLvl(String CIndemLmtLvl) {
		this.CIndemLmtLvl = CIndemLmtLvl;
	}

	public Long getNLiabDaysLmt() {
		return this.NLiabDaysLmt;
	}

	public void setNLiabDaysLmt(Long NLiabDaysLmt) {
		this.NLiabDaysLmt = NLiabDaysLmt;
	}

	public Double getNPerAmt() {
		return this.NPerAmt;
	}

	public void setNPerAmt(Double NPerAmt) {
		this.NPerAmt = NPerAmt;
	}

	public Double getNPerIndemLmt() {
		return this.NPerIndemLmt;
	}

	public void setNPerIndemLmt(Double NPerIndemLmt) {
		this.NPerIndemLmt = NPerIndemLmt;
	}

	public Double getNPerPrm() {
		return this.NPerPrm;
	}

	public void setNPerPrm(Double NPerPrm) {
		this.NPerPrm = NPerPrm;
	}

	public Double getNOnceIndemLmt() {
		return this.NOnceIndemLmt;
	}

	public void setNOnceIndemLmt(Double NOnceIndemLmt) {
		this.NOnceIndemLmt = NOnceIndemLmt;
	}

	public Double getNSavingAmt() {
		return this.NSavingAmt;
	}

	public void setNSavingAmt(Double NSavingAmt) {
		this.NSavingAmt = NSavingAmt;
	}

	public Date getTBgnTm() {
		return this.TBgnTm;
	}

	public void setTBgnTm(Date TBgnTm) {
		this.TBgnTm = TBgnTm;
	}

	public Date getTEndTm() {
		return this.TEndTm;
	}

	public void setTEndTm(Date TEndTm) {
		this.TEndTm = TEndTm;
	}

	public Double getNAmtVar() {
		return this.NAmtVar;
	}

	public void setNAmtVar(Double NAmtVar) {
		this.NAmtVar = NAmtVar;
	}

	public Double getNPrmVar() {
		return this.NPrmVar;
	}

	public void setNPrmVar(Double NPrmVar) {
		this.NPrmVar = NPrmVar;
	}

	public Double getNCalcPrmVar() {
		return this.NCalcPrmVar;
	}

	public void setNCalcPrmVar(Double NCalcPrmVar) {
		this.NCalcPrmVar = NCalcPrmVar;
	}

	public Double getNIndemVar() {
		return this.NIndemVar;
	}

	public void setNIndemVar(Double NIndemVar) {
		this.NIndemVar = NIndemVar;
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

	public String getCResvTxt1() {
		return this.CResvTxt1;
	}

	public void setCResvTxt1(String CResvTxt1) {
		this.CResvTxt1 = CResvTxt1;
	}

	public String getCResvTxt2() {
		return this.CResvTxt2;
	}

	public void setCResvTxt2(String CResvTxt2) {
		this.CResvTxt2 = CResvTxt2;
	}

	public String getCResvTxt3() {
		return this.CResvTxt3;
	}

	public void setCResvTxt3(String CResvTxt3) {
		this.CResvTxt3 = CResvTxt3;
	}

	public String getCResvTxt4() {
		return this.CResvTxt4;
	}

	public void setCResvTxt4(String CResvTxt4) {
		this.CResvTxt4 = CResvTxt4;
	}

	public String getCResvTxt5() {
		return this.CResvTxt5;
	}

	public void setCResvTxt5(String CResvTxt5) {
		this.CResvTxt5 = CResvTxt5;
	}

	public String getCResvTxt6() {
		return this.CResvTxt6;
	}

	public void setCResvTxt6(String CResvTxt6) {
		this.CResvTxt6 = CResvTxt6;
	}

	public String getCResvTxt7() {
		return this.CResvTxt7;
	}

	public void setCResvTxt7(String CResvTxt7) {
		this.CResvTxt7 = CResvTxt7;
	}

	public String getCResvTxt8() {
		return this.CResvTxt8;
	}

	public void setCResvTxt8(String CResvTxt8) {
		this.CResvTxt8 = CResvTxt8;
	}

	public String getCResvTxt9() {
		return this.CResvTxt9;
	}

	public void setCResvTxt9(String CResvTxt9) {
		this.CResvTxt9 = CResvTxt9;
	}

	public String getCResvTxt10() {
		return this.CResvTxt10;
	}

	public void setCResvTxt10(String CResvTxt10) {
		this.CResvTxt10 = CResvTxt10;
	}

	public String getCResvTxt11() {
		return this.CResvTxt11;
	}

	public void setCResvTxt11(String CResvTxt11) {
		this.CResvTxt11 = CResvTxt11;
	}

	public String getCResvTxt12() {
		return this.CResvTxt12;
	}

	public void setCResvTxt12(String CResvTxt12) {
		this.CResvTxt12 = CResvTxt12;
	}

	public String getCResvTxt13() {
		return this.CResvTxt13;
	}

	public void setCResvTxt13(String CResvTxt13) {
		this.CResvTxt13 = CResvTxt13;
	}

	public String getCResvTxt14() {
		return this.CResvTxt14;
	}

	public void setCResvTxt14(String CResvTxt14) {
		this.CResvTxt14 = CResvTxt14;
	}

	public String getCResvTxt15() {
		return this.CResvTxt15;
	}

	public void setCResvTxt15(String CResvTxt15) {
		this.CResvTxt15 = CResvTxt15;
	}

	public String getCResvTxt16() {
		return this.CResvTxt16;
	}

	public void setCResvTxt16(String CResvTxt16) {
		this.CResvTxt16 = CResvTxt16;
	}

	public String getCResvTxt17() {
		return this.CResvTxt17;
	}

	public void setCResvTxt17(String CResvTxt17) {
		this.CResvTxt17 = CResvTxt17;
	}

	public String getCResvTxt18() {
		return this.CResvTxt18;
	}

	public void setCResvTxt18(String CResvTxt18) {
		this.CResvTxt18 = CResvTxt18;
	}

	public String getCResvTxt19() {
		return this.CResvTxt19;
	}

	public void setCResvTxt19(String CResvTxt19) {
		this.CResvTxt19 = CResvTxt19;
	}

	public String getCResvTxt20() {
		return this.CResvTxt20;
	}

	public void setCResvTxt20(String CResvTxt20) {
		this.CResvTxt20 = CResvTxt20;
	}

	public String getCResvTxt21() {
		return this.CResvTxt21;
	}

	public void setCResvTxt21(String CResvTxt21) {
		this.CResvTxt21 = CResvTxt21;
	}

	public String getCResvTxt22() {
		return this.CResvTxt22;
	}

	public void setCResvTxt22(String CResvTxt22) {
		this.CResvTxt22 = CResvTxt22;
	}

	public String getCResvTxt23() {
		return this.CResvTxt23;
	}

	public void setCResvTxt23(String CResvTxt23) {
		this.CResvTxt23 = CResvTxt23;
	}

	public String getCResvTxt24() {
		return this.CResvTxt24;
	}

	public void setCResvTxt24(String CResvTxt24) {
		this.CResvTxt24 = CResvTxt24;
	}

	public String getCResvTxt25() {
		return this.CResvTxt25;
	}

	public void setCResvTxt25(String CResvTxt25) {
		this.CResvTxt25 = CResvTxt25;
	}

	public String getCResvTxt26() {
		return this.CResvTxt26;
	}

	public void setCResvTxt26(String CResvTxt26) {
		this.CResvTxt26 = CResvTxt26;
	}

	public String getCResvTxt27() {
		return this.CResvTxt27;
	}

	public void setCResvTxt27(String CResvTxt27) {
		this.CResvTxt27 = CResvTxt27;
	}

	public String getCResvTxt28() {
		return this.CResvTxt28;
	}

	public void setCResvTxt28(String CResvTxt28) {
		this.CResvTxt28 = CResvTxt28;
	}

	public String getCResvTxt29() {
		return this.CResvTxt29;
	}

	public void setCResvTxt29(String CResvTxt29) {
		this.CResvTxt29 = CResvTxt29;
	}

	public String getCResvTxt30() {
		return this.CResvTxt30;
	}

	public void setCResvTxt30(String CResvTxt30) {
		this.CResvTxt30 = CResvTxt30;
	}

	public Double getNResvNum1() {
		return this.NResvNum1;
	}

	public void setNResvNum1(Double NResvNum1) {
		this.NResvNum1 = NResvNum1;
	}

	public Double getNResvNum2() {
		return this.NResvNum2;
	}

	public void setNResvNum2(Double NResvNum2) {
		this.NResvNum2 = NResvNum2;
	}

	public Double getNResvNum3() {
		return this.NResvNum3;
	}

	public void setNResvNum3(Double NResvNum3) {
		this.NResvNum3 = NResvNum3;
	}

	public Double getNResvNum4() {
		return this.NResvNum4;
	}

	public void setNResvNum4(Double NResvNum4) {
		this.NResvNum4 = NResvNum4;
	}

	public Double getNResvNum5() {
		return this.NResvNum5;
	}

	public void setNResvNum5(Double NResvNum5) {
		this.NResvNum5 = NResvNum5;
	}

	public Double getNResvNum6() {
		return this.NResvNum6;
	}

	public void setNResvNum6(Double NResvNum6) {
		this.NResvNum6 = NResvNum6;
	}

	public Double getNResvNum7() {
		return this.NResvNum7;
	}

	public void setNResvNum7(Double NResvNum7) {
		this.NResvNum7 = NResvNum7;
	}

	public Double getNResvNum8() {
		return this.NResvNum8;
	}

	public void setNResvNum8(Double NResvNum8) {
		this.NResvNum8 = NResvNum8;
	}

	public Double getNResvNum9() {
		return this.NResvNum9;
	}

	public void setNResvNum9(Double NResvNum9) {
		this.NResvNum9 = NResvNum9;
	}

	public Double getNResvNum10() {
		return this.NResvNum10;
	}

	public void setNResvNum10(Double NResvNum10) {
		this.NResvNum10 = NResvNum10;
	}

	public Double getNResvNum11() {
		return this.NResvNum11;
	}

	public void setNResvNum11(Double NResvNum11) {
		this.NResvNum11 = NResvNum11;
	}

	public Double getNResvNum12() {
		return this.NResvNum12;
	}

	public void setNResvNum12(Double NResvNum12) {
		this.NResvNum12 = NResvNum12;
	}

	public Double getNResvNum13() {
		return this.NResvNum13;
	}

	public void setNResvNum13(Double NResvNum13) {
		this.NResvNum13 = NResvNum13;
	}

	public Double getNResvNum14() {
		return this.NResvNum14;
	}

	public void setNResvNum14(Double NResvNum14) {
		this.NResvNum14 = NResvNum14;
	}

	public Double getNResvNum15() {
		return this.NResvNum15;
	}

	public void setNResvNum15(Double NResvNum15) {
		this.NResvNum15 = NResvNum15;
	}

	public Double getNResvNum16() {
		return this.NResvNum16;
	}

	public void setNResvNum16(Double NResvNum16) {
		this.NResvNum16 = NResvNum16;
	}

	public Double getNResvNum17() {
		return this.NResvNum17;
	}

	public void setNResvNum17(Double NResvNum17) {
		this.NResvNum17 = NResvNum17;
	}

	public Double getNResvNum18() {
		return this.NResvNum18;
	}

	public void setNResvNum18(Double NResvNum18) {
		this.NResvNum18 = NResvNum18;
	}

	public Double getNResvNum19() {
		return this.NResvNum19;
	}

	public void setNResvNum19(Double NResvNum19) {
		this.NResvNum19 = NResvNum19;
	}

	public Double getNResvNum20() {
		return this.NResvNum20;
	}

	public void setNResvNum20(Double NResvNum20) {
		this.NResvNum20 = NResvNum20;
	}

	public Double getNResvNum21() {
		return this.NResvNum21;
	}

	public void setNResvNum21(Double NResvNum21) {
		this.NResvNum21 = NResvNum21;
	}

	public Double getNResvNum22() {
		return this.NResvNum22;
	}

	public void setNResvNum22(Double NResvNum22) {
		this.NResvNum22 = NResvNum22;
	}

	public Double getNResvNum23() {
		return this.NResvNum23;
	}

	public void setNResvNum23(Double NResvNum23) {
		this.NResvNum23 = NResvNum23;
	}

	public Double getNResvNum24() {
		return this.NResvNum24;
	}

	public void setNResvNum24(Double NResvNum24) {
		this.NResvNum24 = NResvNum24;
	}

	public Double getNResvNum25() {
		return this.NResvNum25;
	}

	public void setNResvNum25(Double NResvNum25) {
		this.NResvNum25 = NResvNum25;
	}

	public Double getNResvNum26() {
		return this.NResvNum26;
	}

	public void setNResvNum26(Double NResvNum26) {
		this.NResvNum26 = NResvNum26;
	}

	public Double getNResvNum27() {
		return this.NResvNum27;
	}

	public void setNResvNum27(Double NResvNum27) {
		this.NResvNum27 = NResvNum27;
	}

	public Double getNResvNum28() {
		return this.NResvNum28;
	}

	public void setNResvNum28(Double NResvNum28) {
		this.NResvNum28 = NResvNum28;
	}

	public Double getNResvNum29() {
		return this.NResvNum29;
	}

	public void setNResvNum29(Double NResvNum29) {
		this.NResvNum29 = NResvNum29;
	}

	public Double getNResvNum30() {
		return this.NResvNum30;
	}

	public void setNResvNum30(Double NResvNum30) {
		this.NResvNum30 = NResvNum30;
	}

	public Date getTResvTm1() {
		return this.TResvTm1;
	}

	public void setTResvTm1(Date TResvTm1) {
		this.TResvTm1 = TResvTm1;
	}

	public Date getTResvTm2() {
		return this.TResvTm2;
	}

	public void setTResvTm2(Date TResvTm2) {
		this.TResvTm2 = TResvTm2;
	}

	public Date getTResvTm3() {
		return this.TResvTm3;
	}

	public void setTResvTm3(Date TResvTm3) {
		this.TResvTm3 = TResvTm3;
	}

	public Date getTResvTm4() {
		return this.TResvTm4;
	}

	public void setTResvTm4(Date TResvTm4) {
		this.TResvTm4 = TResvTm4;
	}

	public Date getTResvTm5() {
		return this.TResvTm5;
	}

	public void setTResvTm5(Date TResvTm5) {
		this.TResvTm5 = TResvTm5;
	}

	public boolean isSamePremCalcResult(AbstractCvrgVO other) {
		//费率
		if (this.getNRate() != null) {
			if (!this.getNRate().equals(other.getNRate())) {
				return false;
			}
		} else {
			if (other.getNRate() != null) {
				return false;
			}
		}

		//基本保费
		if (this.getNBasePrm() != null) {
			if (!this.getNBasePrm().equals(other.getNBasePrm())) {
				return false;
			}
		} else {
			if (other.getNBasePrm() != null) {
				return false;
			}
		}

		//折前保费
		if (this.getNBefPrm() != null) {
			if (!this.getNBefPrm().equals(other.getNBefPrm())) {
				return false;
			}
		} else {
			if (other.getNBefPrm() != null) {
				return false;
			}
		}

		//折扣系数
		if (this.getNDisCoef() != null) {
			if (!this.getNDisCoef().equals(other.getNDisCoef())) {
				return false;
			}
		} else {
			if (other.getNDisCoef() != null) {
				return false;
			}
		}

		//计算保费
		if (this.getNCalcPrm() != null) {
			if (!this.getNCalcPrm().equals(other.getNCalcPrm())) {
				return false;
			}
		} else {
			if (other.getNCalcPrm() != null) {
				return false;
			}
		}

		//年折前保费
		if (this.getNBefAnnPrm() != null) {
			if (!this.getNBefAnnPrm().equals(other.getNBefAnnPrm())) {
				return false;
			}
		} else {
			if (other.getNBefAnnPrm() != null) {
				return false;
			}
		}

		//年计算保费
		if (this.getNCalcAnnPrm() != null) {
			if (!this.getNCalcAnnPrm().equals(other.getNCalcAnnPrm())) {
				return false;
			}
		} else {
			if (other.getNCalcAnnPrm() != null) {
				return false;
			}
		}

		return true;
	}

	public Long getNEdrPrjNo() {
		return this.NEdrPrjNo;
	}

	public void setNEdrPrjNo(Long edrPrjNo) {
		this.NEdrPrjNo = edrPrjNo;
	}

	public String getCDductMrk() {
		return this.CDductMrk;
	}

	public void setCDductMrk(String dductMrk) {
		this.CDductMrk = dductMrk;
	}

	public String getCLatestMrk() {
		return this.CLatestMrk;
	}

	public void setCLatestMrk(String latestMrk) {
		this.CLatestMrk = latestMrk;
	}

	public String getCRowId() {
		return this.CRowId;
	}

	public void setCRowId(String rowId) {
		this.CRowId = rowId;
	}

	public Double getNFloatRate() {
		return NFloatRate;
	}

	public void setNFloatRate(Double floatRate) {
		NFloatRate = floatRate;
	}

	public String getCUnderInsuranceFlag() {
		return CUnderInsuranceFlag;
	}

	public void setCUnderInsuranceFlag(String underInsuranceFlag) {
		CUnderInsuranceFlag = underInsuranceFlag;
	}

	public Double getNCompenRate() {
		return NCompenRate;
	}

	public void setNCompenRate(Double compenRate) {
		NCompenRate = compenRate;
	}

	public String getCTermNo() {
		return CTermNo;
	}

	public void setCTermNo(String cTermNo) {
		CTermNo = cTermNo;
	}

	public String getCTermUrl() {
		return CTermUrl;
	}

	public void setCTermUrl(String cTermUrl) {
		CTermUrl = cTermUrl;
	}

	public Double getNNetPrm() {
		return NNetPrm;
	}

	public void setNNetPrm(Double nNetPrm) {
		NNetPrm = nNetPrm;
	}

	public Double getNNetPrmVar() {
		return NNetPrmVar;
	}

	public void setNNetPrmVar(Double nNetPrmVar) {
		NNetPrmVar = nNetPrmVar;
	}

	public String getCCvrgTypFlag() {
		return CCvrgTypFlag;
	}

	public void setCCvrgTypFlag(String CCvrgTypFlag) {
		this.CCvrgTypFlag = CCvrgTypFlag;
	}

	public String getCHealthType() {

		return CHealthType;
	}

	public void setCHealthType(String CHealthType) {
		this.CHealthType = CHealthType;
	}

	public String getCType() {
		return CType;
	}

	public void setCType(String cType) {
		CType = cType;
	}

	public String getCAliasNme() {
		return CAliasNme;
	}

	public void setCAliasNme(String cAliasNme) {
		CAliasNme = cAliasNme;
	}

	public String getCRealProdNo() {
		return CRealProdNo;
	}

	public void setCRealProdNo(String cRealProdNo) {
		CRealProdNo = cRealProdNo;
	}

	public String getCOccupTyp() {
		return COccupTyp;
	}

	public void setCOccupTyp(String cOccupTyp) {
		COccupTyp = cOccupTyp;
	}

	public Double getNAppCopies() {
		return NAppCopies;
	}

	public void setNAppCopies(Double nAppCopies) {
		NAppCopies = nAppCopies;
	}

	public Double getNDailyAllowance() {
		return NDailyAllowance;
	}

	public void setNDailyAllowance(Double nDailyAllowance) {
		NDailyAllowance = nDailyAllowance;
	}

	public String getCFinCde() {
		return CFinCde;
	}

	public void setCFinCde(String cFinCde) {
		CFinCde = cFinCde;
	}

	public String getCShareAmtMark() {
		return CShareAmtMark;
	}

	public void setCShareAmtMark(String CShareAmtMark) {
		this.CShareAmtMark = CShareAmtMark;
	}

	public Long getNShareAmtPeopleNum() {
		return NShareAmtPeopleNum;
	}

	public void setNShareAmtPeopleNum(Long NShareAmtPeopleNum) {
		this.NShareAmtPeopleNum = NShareAmtPeopleNum;
	}
}