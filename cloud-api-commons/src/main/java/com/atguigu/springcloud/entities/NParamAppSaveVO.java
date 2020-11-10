package com.atguigu.springcloud.entities;

import com.atguigu.springcloud.entities.coreVo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/14 11:11
 */
public class NParamAppSaveVO {
    /**
     *
     */
    private static final long serialVersionUID = 1866557921805878351L;

    private String appNo;
    private String plyNo;
    private String permium;
    private String productCode;
    private String productName;
    private String schemeName;
    private String startDate;
    private String endDate;
    private String fixSpc;
    private PlyApplicantVO applicantVO;
    private PlyInsuredVO insuredVO;
    private List<PlyCvrgVO> cvrgList;
    private List<PlyFeeVO> feeList;
   // private List<TelNVhlQuestionsVO> quList;
    private PlyAcctinfoVO acctinfoVO;
    private PlyBaseVO baseVO;
    //private TelNVhlTgtVO tgtVO;
    //private List<TelNVhlTgtObjVO> tgtObjList;
    private List<PlyBnfcVO> bnfcList;
 //  private List<> grpMemberList;
    private List<PlyPayVO> payList;
  //  private TelNVhlDriverInfoVO driverInfoVo;
    private PlyAcctinfoVO acctVo;
   // private List<TelNVhlCiInfoVO> ciList; //渠道共保信息list
    private List<EntryObj> entryObjList = new ArrayList<EntryObj>();//= ;//扩展信息



    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getPlyNo() {
        return plyNo;
    }

    public void setPlyNo(String plyNo) {
        this.plyNo = plyNo;
    }

    public String getPermium() {
        return permium;
    }

    public void setPermium(String permium) {
        this.permium = permium;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFixSpc() {
        return fixSpc;
    }

    public void setFixSpc(String fixSpc) {
        this.fixSpc = fixSpc;
    }

    public PlyApplicantVO getApplicantVO() {
        return applicantVO;
    }

    public void setApplicantVO(PlyApplicantVO applicantVO) {
        this.applicantVO = applicantVO;
    }

    public PlyInsuredVO getInsuredVO() {
        return insuredVO;
    }

    public void setInsuredVO(PlyInsuredVO insuredVO) {
        this.insuredVO = insuredVO;
    }

    public List<PlyCvrgVO> getCvrgList() {
        return cvrgList;
    }

    public void setCvrgList(List<PlyCvrgVO> cvrgList) {
        this.cvrgList = cvrgList;
    }

    public List<PlyFeeVO> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<PlyFeeVO> feeList) {
        this.feeList = feeList;
    }

    public PlyAcctinfoVO getAcctinfoVO() {
        return acctinfoVO;
    }

    public void setAcctinfoVO(PlyAcctinfoVO acctinfoVO) {
        this.acctinfoVO = acctinfoVO;
    }

    public PlyBaseVO getBaseVO() {
        return baseVO;
    }

    public void setBaseVO(PlyBaseVO baseVO) {
        this.baseVO = baseVO;
    }

    public List<PlyBnfcVO> getBnfcList() {
        return bnfcList;
    }

    public void setBnfcList(List<PlyBnfcVO> bnfcList) {
        this.bnfcList = bnfcList;
    }

    public List<PlyPayVO> getPayList() {
        return payList;
    }

    public void setPayList(List<PlyPayVO> payList) {
        this.payList = payList;
    }

    public PlyAcctinfoVO getAcctVo() {
        return acctVo;
    }

    public void setAcctVo(PlyAcctinfoVO acctVo) {
        this.acctVo = acctVo;
    }

    public List<EntryObj> getEntryObjList() {
        return entryObjList;
    }

    public void setEntryObjList(List<EntryObj> entryObjList) {
        this.entryObjList = entryObjList;
    }
}
