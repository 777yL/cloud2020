package com.atguigu.springcloud.entities.coreVo.AbstractVo;

import java.util.Date;

/**
 * AbstractInsuredVO entity - Base definition for InsuredVO and InsAppuredVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */

public abstract class AbstractInsuredVO implements java.io.Serializable {

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
    private String CLatestMrk;
    private Long NSeqNo;
    /** */
    private String CInsuredCde;
    /** */
    private String CInsuredNme;
    /** */
    private String CCertfCls;
    /** */
    private String CCertfCde;
    /** */
    private String CStkMrk;
    /** */
    private String CCusLvl;
    /** */
    private String CClntMrk;
    /** */
    private String CCntrNme;
    /** */
    private String CTel;
    /** */
    private String CMobile;
    /** */
    private String CEmail;
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
    private String CClntAddr;
    /** */
    private String CZipCde;
    /** */
    private String CResidAddr;
    /** */
    private String CResidZip;
    /** */
    private String CWorkDpt;
    /** */
    private String CWorkDptAddr;
    /** */
    private String CWorkDptZip;
    /** */
    private String CSex;
    /** */
    private Date TBirthday;
    /** */
    private String CHealthCde;
    /** */
    private String CHealthDesc;
    /** */
    private String CTrdCde;
    /** */
    private String CSubTrdCde;
    /** */
    private String COccupCde;
    /** */
    private String CSidelineMrk;
    /** */
    private String CPosition;
    /** */
    private String CDuty;
    /** */
    private Double NIncome;
    /** */
    private String CEduLvlCde;
    /** */
    private String CMrgCde;
    /** */
    private String CChldStsCde;
    /** */
    private String CConveyanceCde;
    /** */
    private String CInsHistory;

    private Double NDrvAge;
    /** */
    private Date TUpdTm;
    /** */
    private String CUpdCde;
    /** */
    private Date TCrtTm;
    /** */
    private String CCrtCde;
    /** */
    private String CRowId;

    private Double NAge;

    //以下为新增字段
    private String CResvTxt1;
    private String CResvTxt2;
    private String CResvTxt3;
    private String CCusRiskLvl; //客户风险等级

    //一家新增字段 Begin
    private String CFax;//传真
    private Date TCertfEndDate;//证件有效期限

    private String COperaterCertfCde;//经办人身份证号码
    private Date TOperaterCertfEndTm;//经办人身份证有效期至

    private String CLegalCertfCls;//法定代表人证件类型
    private String CLegalCertfCde;//法定代表人证件号码
    private Date   TLegalCertfEndTm;//法定代表人证件有效期限
    private String CLegalNme;//法定代表人的姓名
    private String CCustRiskRank; //反洗钱客户风险等级
    private String CRelInsuredCde;
    private String CInsuredCls;
    private String CTowns;
    private String CGroup;
    //一家新增字段 End

    //以下为老系统添加字段 xiongzhe
    private String CResvTxt4;
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

    private String CResvTxt5;
    private String CResvTxt6;
    private String CResvTxt7;
    private String CResvTxt8;
    private String CResvTxt9;
    private String CResvTxt10;
    private String CResvTxt11;
    private String CResvTxt12;
    private String CNation;//国籍
    private String COccupTyp;//职业类别
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
    //  wangrui
    private String CResvTxt13;
    private String CResvTxt14;
    private String CResvTxt15;
    private String CResvTxt16;
    private String CResvTxt17;
    private String CResvTxt18;
    private String CResvTxt19;
    private String CResvTxt20;
    private String CResvTxt21;
    private String CResvTxt22;
    private String CResvTxt23;
    private String CResvTxt24;
    private String CResvTxt25;
    private String CResvTxt26;
    private String CResvTxt27;
    private String CResvTxt28;
    private String CResvTxt29;
    private String CResvTxt30;
    private String CResvTxt31;

    private Double NResvNum1;
    private Double NResvNum2;
    private Double NResvNum3;
    private Double NResvNum4;
    private Double NResvNum5;
    private Double NResvNum6;

    private Date TCertfBgnDate;//NNC-20181229101-反洗钱新增字段：证件有效期起期
    private String CResvTxt32; //NNC-20181229101-反洗钱新增字段：经常居住地

    //add by Lvpeng 新疆反洗钱事宜新增2016-11-11 14:42:50
    private String CBusinessScope;//经营范围

    private String COperaterCertfTyp;//办理人员证件种类

    private String CIsThereAsocialSecurity; // 是否参加社保



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

    // Constructors

    public String getCResvTxt4() {
        return CResvTxt4;
    }

    public void setCResvTxt4(String resvTxt4) {
        CResvTxt4 = resvTxt4;
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

    public String getCInsuredCls() {
        return CInsuredCls;
    }

    public void setCInsuredCls(String insuredCls) {
        CInsuredCls = insuredCls;
    }

    public String getCRelInsuredCde() {
        return CRelInsuredCde;
    }

    public void setCRelInsuredCde(String relInsuredCde) {
        CRelInsuredCde = relInsuredCde;
    }

    /** default constructor */
    public AbstractInsuredVO() {
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

    public String getCInsuredCde() {
        return this.CInsuredCde;
    }

    public void setCInsuredCde(String CInsuredCde) {
        this.CInsuredCde = CInsuredCde;
    }

    public String getCInsuredNme() {
        return this.CInsuredNme;
    }

    public void setCInsuredNme(String CInsuredNme) {
        this.CInsuredNme = CInsuredNme;
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


    public String getCEmail() {
        return this.CEmail;
    }

    public void setCEmail(String CEmail) {
        this.CEmail = CEmail;
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

    public String getCStkMrk() {
        return CStkMrk;
    }

    public void setCStkMrk(String stkMrk) {
        CStkMrk = stkMrk;
    }

    public String getCCusLvl() {
        return CCusLvl;
    }

    public void setCCusLvl(String cusLvl) {
        CCusLvl = cusLvl;
    }

    public String getCClntMrk() {
        return CClntMrk;
    }

    public void setCClntMrk(String clntMrk) {
        CClntMrk = clntMrk;
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

    public String getCResidAddr() {
        return this.CResidAddr;
    }

    public void setCResidAddr(String CResidAddr) {
        this.CResidAddr = CResidAddr;
    }

    public String getCResidZip() {
        return this.CResidZip;
    }

    public void setCResidZip(String CResidZip) {
        this.CResidZip = CResidZip;
    }

    public String getCWorkDpt() {
        return this.CWorkDpt;
    }

    public void setCWorkDpt(String CWorkDpt) {
        this.CWorkDpt = CWorkDpt;
    }

    public String getCWorkDptAddr() {
        return this.CWorkDptAddr;
    }

    public void setCWorkDptAddr(String CWorkDptAddr) {
        this.CWorkDptAddr = CWorkDptAddr;
    }

    public String getCWorkDptZip() {
        return this.CWorkDptZip;
    }

    public void setCWorkDptZip(String CWorkDptZip) {
        this.CWorkDptZip = CWorkDptZip;
    }

    public String getCSex() {
        return this.CSex;
    }

    public void setCSex(String CSex) {
        this.CSex = CSex;
    }

    public Date getTBirthday() {
        return this.TBirthday;
    }

    public void setTBirthday(Date TBirthday) {
        this.TBirthday = TBirthday;
    }

    public String getCHealthCde() {
        return this.CHealthCde;
    }

    public void setCHealthCde(String CHealthCde) {
        this.CHealthCde = CHealthCde;
    }

    public String getCHealthDesc() {
        return this.CHealthDesc;
    }

    public void setCHealthDesc(String CHealthDesc) {
        this.CHealthDesc = CHealthDesc;
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

    public String getCOccupCde() {
        return this.COccupCde;
    }

    public void setCOccupCde(String COccupCde) {
        this.COccupCde = COccupCde;
    }

    public String getCSidelineMrk() {
        return this.CSidelineMrk;
    }

    public void setCSidelineMrk(String CSidelineMrk) {
        this.CSidelineMrk = CSidelineMrk;
    }

    public String getCPosition() {
        return this.CPosition;
    }

    public void setCPosition(String CPosition) {
        this.CPosition = CPosition;
    }

    public String getCDuty() {
        return this.CDuty;
    }

    public void setCDuty(String CDuty) {
        this.CDuty = CDuty;
    }

    public Double getNIncome() {
        return this.NIncome;
    }

    public void setNIncome(Double NIncome) {
        this.NIncome = NIncome;
    }

    public String getCEduLvlCde() {
        return this.CEduLvlCde;
    }

    public void setCEduLvlCde(String CEduLvlCde) {
        this.CEduLvlCde = CEduLvlCde;
    }

    public String getCMrgCde() {
        return this.CMrgCde;
    }

    public void setCMrgCde(String CMrgCde) {
        this.CMrgCde = CMrgCde;
    }

    public String getCChldStsCde() {
        return this.CChldStsCde;
    }

    public void setCChldStsCde(String CChldStsCde) {
        this.CChldStsCde = CChldStsCde;
    }

    public String getCConveyanceCde() {
        return this.CConveyanceCde;
    }

    public void setCConveyanceCde(String CConveyanceCde) {
        this.CConveyanceCde = CConveyanceCde;
    }

    public String getCInsHistory() {
        return this.CInsHistory;
    }

    public void setCInsHistory(String CInsHistory) {
        this.CInsHistory = CInsHistory;
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

    public Double getNDrvAge() {
        return NDrvAge;
    }

    public void setNDrvAge(Double drvAge) {
        NDrvAge = drvAge;
    }

    public String getCRowId() {
        return CRowId;
    }

    public void setCRowId(String rowId) {
        CRowId = rowId;
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

    public String getCResvTxt3() {
        return CResvTxt3;
    }

    public void setCResvTxt3(String resvTxt3) {
        CResvTxt3 = resvTxt3;
    }

    public String getCCusRiskLvl() {
        return CCusRiskLvl;
    }

    public void setCCusRiskLvl(String cusRiskLvl) {
        CCusRiskLvl = cusRiskLvl;
    }

    public String getCOperaterCertfCde() {
        return COperaterCertfCde;
    }

    public void setCOperaterCertfCde(String cOperaterCertfCde) {
        COperaterCertfCde = cOperaterCertfCde;
    }

    public Date getTOperaterCertfEndTm() {
        return TOperaterCertfEndTm;
    }

    public void setTOperaterCertfEndTm(Date operaterCertfEndTm) {
        TOperaterCertfEndTm = operaterCertfEndTm;
    }

    public String getCFax() {
        return CFax;
    }

    public void setCFax(String fax) {
        CFax = fax;
    }



    public String getCLegalCertfCls() {
        return CLegalCertfCls;
    }

    public String getCLegalCertfCde() {
        return CLegalCertfCde;
    }

    public Date getTLegalCertfEndTm() {
        return TLegalCertfEndTm;
    }

    public String getCLegalNme() {
        return CLegalNme;
    }



    public Date getTCertfEndDate() {
        return TCertfEndDate;
    }

    public void setTCertfEndDate(Date certfEndDate) {
        TCertfEndDate = certfEndDate;
    }


    public void setCLegalCertfCls(String legalCertfCls) {
        CLegalCertfCls = legalCertfCls;
    }

    public void setCLegalCertfCde(String legalCertfCde) {
        CLegalCertfCde = legalCertfCde;
    }

    public void setTLegalCertfEndTm(Date legalCertfEndTm) {
        TLegalCertfEndTm = legalCertfEndTm;
    }

    public void setCLegalNme(String legalNme) {
        CLegalNme = legalNme;
    }

    public Double getNAge() {
        return NAge;
    }

    public void setNAge(Double age) {
        NAge = age;
    }

    public String getCCustRiskRank() {
        return CCustRiskRank;
    }

    public void setCCustRiskRank(String custRiskRank) {
        CCustRiskRank = custRiskRank;
    }

    public String getCResvTxt13() {
        return CResvTxt13;
    }

    public void setCResvTxt13(String resvTxt13) {
        CResvTxt13 = resvTxt13;
    }

    public String getCResvTxt14() {
        return CResvTxt14;
    }

    public void setCResvTxt14(String resvTxt14) {
        CResvTxt14 = resvTxt14;
    }

    public String getCResvTxt15() {
        return CResvTxt15;
    }

    public void setCResvTxt15(String resvTxt15) {
        CResvTxt15 = resvTxt15;
    }

    public String getCResvTxt16() {
        return CResvTxt16;
    }

    public void setCResvTxt16(String resvTxt16) {
        CResvTxt16 = resvTxt16;
    }

    public String getCResvTxt17() {
        return CResvTxt17;
    }

    public void setCResvTxt17(String resvTxt17) {
        CResvTxt17 = resvTxt17;
    }

    public String getCResvTxt18() {
        return CResvTxt18;
    }

    public void setCResvTxt18(String resvTxt18) {
        CResvTxt18 = resvTxt18;
    }

    public String getCResvTxt19() {
        return CResvTxt19;
    }

    public void setCResvTxt19(String resvTxt19) {
        CResvTxt19 = resvTxt19;
    }

    public String getCResvTxt20() {
        return CResvTxt20;
    }

    public void setCResvTxt20(String resvTxt20) {
        CResvTxt20 = resvTxt20;
    }

    public Double getNResvNum1() {
        return NResvNum1;
    }

    public void setNResvNum1(Double resvNum1) {
        NResvNum1 = resvNum1;
    }

    public Double getNResvNum2() {
        return NResvNum2;
    }

    public void setNResvNum2(Double resvNum2) {
        NResvNum2 = resvNum2;
    }

    public Double getNResvNum3() {
        return NResvNum3;
    }

    public void setNResvNum3(Double resvNum3) {
        NResvNum3 = resvNum3;
    }

    public String getCResvTxt21() {
        return CResvTxt21;
    }

    public void setCResvTxt21(String resvTxt21) {
        CResvTxt21 = resvTxt21;
    }

    public String getCResvTxt22() {
        return CResvTxt22;
    }

    public void setCResvTxt22(String resvTxt22) {
        CResvTxt22 = resvTxt22;
    }

    public String getCResvTxt23() {
        return CResvTxt23;
    }

    public void setCResvTxt23(String resvTxt23) {
        CResvTxt23 = resvTxt23;
    }

    public String getCResvTxt24() {
        return CResvTxt24;
    }

    public void setCResvTxt24(String resvTxt24) {
        CResvTxt24 = resvTxt24;
    }

    public String getCResvTxt25() {
        return CResvTxt25;
    }

    public void setCResvTxt25(String resvTxt25) {
        CResvTxt25 = resvTxt25;
    }

    public String getCResvTxt26() {
        return CResvTxt26;
    }

    public void setCResvTxt26(String resvTxt26) {
        CResvTxt26 = resvTxt26;
    }

    public String getCResvTxt27() {
        return CResvTxt27;
    }

    public void setCResvTxt27(String resvTxt27) {
        CResvTxt27 = resvTxt27;
    }

    public String getCResvTxt28() {
        return CResvTxt28;
    }

    public void setCResvTxt28(String resvTxt28) {
        CResvTxt28 = resvTxt28;
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

    public String getCResvTxt29() {
        return CResvTxt29;
    }

    public void setCResvTxt29(String resvTxt29) {
        CResvTxt29 = resvTxt29;
    }

    public String getCResvTxt30() {
        return CResvTxt30;
    }

    public void setCResvTxt30(String resvTxt30) {
        CResvTxt30 = resvTxt30;
    }

    public String getCResvTxt31() {
        return CResvTxt31;
    }

    public void setCResvTxt31(String resvTxt31) {
        CResvTxt31 = resvTxt31;
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

    public String getCIsThereAsocialSecurity() {
        return CIsThereAsocialSecurity;
    }

    public void setCIsThereAsocialSecurity(String CIsThereAsocialSecurity) {
        this.CIsThereAsocialSecurity = CIsThereAsocialSecurity;
    }
}