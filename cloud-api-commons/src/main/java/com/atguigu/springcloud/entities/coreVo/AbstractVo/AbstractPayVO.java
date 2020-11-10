package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

/**
 * AbstractPayVO entity - Base definition for PayVO and PayAppVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public abstract class AbstractPayVO implements java.io.Serializable {

	// Fields

	/** */
	private String CPkId;
	/** */
	private String CAppNo;
	/** */
	private String CPlyNo;
	/** */
	private String CEdrNo;
	private String CLatestMrk;
	/** */
	private Long NTms;
	/** */
	private String CProdNo;
	/** */
	private Long NEdrPrjNo;
	private String CPayorNme;
	/** */
	private String CPayorCde;
	/** */
	private Double NPayablePrm;
	/** */
	private String CPayModeCde;
	/** */
	private Date TPayBgnTm;
	/** */
	private Date TPayEndTm;
	/** */
	private Date TPaidTm;
	/** */
	private String CVchTyp;
	/** */
	private String CRecptNo;
	/** */
	private Double NPaidPrm;
	/** */
	private String CCurCde;
	/** */
	private String CBankCde;
	/** */
	private String CAcNo;
	/** */
	private Date TCrtTm;
	/** */
	private String CCrtCde;
	/** */
	private Date TUpdTm;
	/** */
	private String CUpdCde;
	/** */
	private String CRowId;
	/** */
	private Double NPrmVar;
	private Double NOwnPrm;//我司分期保费
	// Constructors

	private Double NNotaxPrm;//不含税保费
	private Double NAddedTax;//增值税额
	private Double NTaxPrm;//应税保费
	private Double NFreeTaxPrm;//免税保费
	private Double NComm;//手续费
	private Double NBrkPrm;//经纪费
	private Double NBrkAddedTax;//增值税进项税额
	private Double NWdgAddedTax;//代扣代缴增值税额
	private Double NAdlAddedTax;//代扣代缴附加税额
	private Double NBalance;//余额
	private String CCombinationNo; // 组合产品申请单号
	/** 缴费计划分期唯一标识码 */
	private String CShortPayId;

	public String getCCombinationNo() {
		return CCombinationNo;
	}

	public void setCCombinationNo(String CCombinationNo) {
		this.CCombinationNo = CCombinationNo;
	}

	public Double getNTaxPrm() {
		return NTaxPrm;
	}

	public void setNTaxPrm(Double taxPrm) {
		NTaxPrm = taxPrm;
	}

	public Double getNFreeTaxPrm() {
		return NFreeTaxPrm;
	}

	public void setNFreeTaxPrm(Double freeTaxPrm) {
		NFreeTaxPrm = freeTaxPrm;
	}

	public Double getNComm() {
		return NComm;
	}

	public void setNComm(Double comm) {
		NComm = comm;
	}

	public Double getNBrkPrm() {
		return NBrkPrm;
	}

	public void setNBrkPrm(Double brkPrm) {
		NBrkPrm = brkPrm;
	}

	public Double getNBrkAddedTax() {
		return NBrkAddedTax;
	}

	public void setNBrkAddedTax(Double brkAddedTax) {
		NBrkAddedTax = brkAddedTax;
	}

	public Double getNWdgAddedTax() {
		return NWdgAddedTax;
	}

	public void setNWdgAddedTax(Double wdgAddedTax) {
		NWdgAddedTax = wdgAddedTax;
	}

	public Double getNAdlAddedTax() {
		return NAdlAddedTax;
	}

	public void setNAdlAddedTax(Double adlAddedTax) {
		NAdlAddedTax = adlAddedTax;
	}

	public Double getNBalance() {
		return NBalance;
	}

	public void setNBalance(Double balance) {
		NBalance = balance;
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

	/** default constructor */
	public AbstractPayVO() {
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

	public Double getNOwnPrm() {
		return NOwnPrm;
	}

	public void setNOwnPrm(Double nOwnPrm) {
		NOwnPrm = nOwnPrm;
	}

	public void setCEdrNo(String CEdrNo) {
		this.CEdrNo = CEdrNo;
	}

	public Long getNTms() {
		return this.NTms;
	}

	public void setNTms(Long NTms) {
		this.NTms = NTms;
	}

	public String getCProdNo() {
		return this.CProdNo;
	}

	public void setCProdNo(String CProdNo) {
		this.CProdNo = CProdNo;
	}

	public String getCPayorNme() {
		return this.CPayorNme;
	}

	public void setCPayorNme(String CPayorNme) {
		this.CPayorNme = CPayorNme;
	}

	public String getCPayorCde() {
		return this.CPayorCde;
	}

	public void setCPayorCde(String CPayorCde) {
		this.CPayorCde = CPayorCde;
	}

	public Double getNPayablePrm() {
		return this.NPayablePrm;
	}

	public void setNPayablePrm(Double NPayablePrm) {
		this.NPayablePrm = NPayablePrm;
	}

	public String getCPayModeCde() {
		return this.CPayModeCde;
	}

	public void setCPayModeCde(String CPayModeCde) {
		this.CPayModeCde = CPayModeCde;
	}

	public Date getTPayBgnTm() {
		return this.TPayBgnTm;
	}

	public void setTPayBgnTm(Date TPayBgnTm) {
		this.TPayBgnTm = TPayBgnTm;
	}

	public Date getTPayEndTm() {
		return this.TPayEndTm;
	}

	public void setTPayEndTm(Date TPayEndTm) {
		this.TPayEndTm = TPayEndTm;
	}

	public Date getTPaidTm() {
		return this.TPaidTm;
	}

	public void setTPaidTm(Date TPaidTm) {
		this.TPaidTm = TPaidTm;
	}

	public String getCVchTyp() {
		return this.CVchTyp;
	}

	public void setCVchTyp(String CVchTyp) {
		this.CVchTyp = CVchTyp;
	}

	public String getCRecptNo() {
		return this.CRecptNo;
	}

	public void setCRecptNo(String CRecptNo) {
		this.CRecptNo = CRecptNo;
	}

	public Double getNPaidPrm() {
		return this.NPaidPrm;
	}

	public void setNPaidPrm(Double NPaidPrm) {
		this.NPaidPrm = NPaidPrm;
	}

	public String getCCurCde() {
		return this.CCurCde;
	}

	public void setCCurCde(String CCurCde) {
		this.CCurCde = CCurCde;
	}

	public String getCAcNo() {
		return this.CAcNo;
	}

	public void setCAcNo(String CAcNo) {
		this.CAcNo = CAcNo;
	}

	public Date getTCrtTm() {
		return this.TCrtTm;
	}

	public void setTCrtTm(Date TCrtTm) {
		this.TCrtTm = TCrtTm;
	}

	public String getCCrtCde() {
		return this.CCrtCde;
	}

	public void setCCrtCde(String CCrtCde) {
		this.CCrtCde = CCrtCde;
	}

	public Date getTUpdTm() {
		return this.TUpdTm;
	}

	public void setTUpdTm(Date TUpdTm) {
		this.TUpdTm = TUpdTm;
	}

	public String getCUpdCde() {
		return this.CUpdCde;
	}

	public void setCUpdCde(String CUpdCde) {
		this.CUpdCde = CUpdCde;
	}

	public String getCBankCde() {
		return CBankCde;
	}

	public void setCBankCde(String bankCde) {
		CBankCde = bankCde;
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

	public String getCRowId() {
		return CRowId;
	}

	public void setCRowId(String rowId) {
		CRowId = rowId;
	}

	public Double getNPrmVar() {
		return NPrmVar;
	}

	public void setNPrmVar(Double prmVar) {
		NPrmVar = prmVar;
	}

	public String getCShortPayId() {
		return CShortPayId;
	}

	public void setCShortPayId(String CShortPayId) {
		this.CShortPayId = CShortPayId;
	}
}