package com.atguigu.springcloud.entities.coreVo.AbstractVo;



/**
 * AbstractBaseVO entity - Base definition for BaseVO and BasAppeVO .
 *
 * @author jiangqf@isoftstone-ai.com
 */


import java.util.Date;

/**
 * @author ycyang
 */
public abstract class AbstractBaseVO  /*extends ThreadBaseVo*/ implements java.io.Serializable {

    private String CCommodityNo; // 商品号

    public String getCCommodityNo() {
        return CCommodityNo;
    }

    public void setCCommodityNo(String CCommodityNo) {
        this.CCommodityNo = CCommodityNo;
    }

    private String CCombinationNo; // 组合产品申请单号

    public String getCCombinationNo() {
        return CCombinationNo;
    }

    /**
     * 研发版本新增字段
     * 联保标志('0'非联保'1'联保)
     */
    private String CJiMrk;

    public String getCJiMrk() {
        return CJiMrk;
    }

    public void setCJiMrk(String CJiMrk) {
        this.CJiMrk = CJiMrk;
    }

    public void setCCombinationNo(String CCombinationNo) {
        this.CCombinationNo = CCombinationNo;
    }

    // Fields
    /**
     * web_ply_base or web_app_base
     */
    private String CAppNo;//C_APP_NO 申请单号
    /** */
    private String CAppTyp;//C_APP_TYP  保单类型 'A' 投保单,'E'批改申请单,'Q'报价单,'O'开口保单
    /** */
    private String CPlyNo;//C_PLY_NO 保单号 Policy No
    /** */
    private Long NEdrPrjNo;//N_EDR_PRJ_NO 批改次数
    /** */
    private String CEdrNo;//C_EDR_NO 批单号
    /** */
    private String CProdNo;//C_PROD_NO 产品代码
    /** */
    private String CDptCde;//C_DPT_CDE 机构代码
    /** */
    private String CSlsCde;//C_SLS_CDE 业务员
    /** */
    private String CBsnsTyp;//C_BSNS_TYP 业务来源
    /** */
    private String CBsnsSubtyp;//C_BSNS_SUBTYP 业务来源细分
    /** */
    private String CBrkrCde;//C_BRKR_CDE 代理人/经纪人
    /** */
    private String CAgtAgrNo;//C_AGT_AGR_NO 代理协议或合作协议号
    /** */
    private String NSubCoNo;//N_SUB_CO_NO 补充协议号
    /** */
    private Double NCommRate;//N_COMM_RATE 手续费比例
    /** */
    private String CRenewMrk;//C_RENEW_MRK 续保标志:'0'新保;'1'续保
    /** */
    private String COrigPlyNo;//C_ORIG_PLY_NO 续保单上年保单号
    /** */
    private String COrigInsurer;//C_ORIG_INSURER 上年保险公司
    /** */
    private String CAmtCur;//C_AMT_CUR 保额币种
    /** */
    private Double NAmt;//N_AMT 保额合计
    /** */
    private Double NAmtRmbExch;//N_AMT_RMB_EXCH 保费汇率
    /** */
    private String CPrmCur;//C_PRM_CUR 保费币种
    /** */
    private Double NCalcPrm;//N_CALC_PRM 计算保费合计,系统自动计算的保费金额
    /** */
    private Double NPrm;//N_PRM 保费合计
    /** */
    private Double NPrmRmbExch;//N_PRM_RMB_EXCH 保费人民币汇率
    /** */
    private Double NIndemLmt;//N_INDEM_LMT 赔偿限额合计
    /** */
    private String CRatioTyp;//C_RATIO_TYP 短期费率方式
    /** */
    private Double NRatioCoef;//N_RATIO_COEF 短期系数
    /** */
    private Double NSavingAmt;//N_SAVING_AMT 储金
    /** */
    private Double NPrmDisc;//N_Prm_Disc 折扣系数
    /** */
    private String CPlySts;//C_PLY_STS 保单状态 Policy Status，I: 非终止(有效或满期) T: Terminated 终止(注退)
    /** */
    private Date TTermnTm;//T_TERMN_TM 保单终止时间
    /** */
    private String CInwdMrk;//C_INWD_MRK 分入业务标志('0'非分入;'1'分入)
    /** */
    private String CCiMrk;//C_CI_MRK 共保标志('0'非共保'1'共保)
    /**
     * @deprecated 合并使用CCiMrk
     */
//    @Deprecated
    private String CCiTyp;//C_CI_TYP 共保方式代码
    /** */
    private Double NCiJntAmt;//N_CI_JNT_AMT 共保总保额
    /** */
    private Double NCiJntPrm;//N_CI_JNT_PRM 共保总保费
    /** */
    private String CLongTermMrk;//C_LONG_TERM_MRK 多年期标志('0'短期;'1'多年期)
    /** */
    private Date TAppTm;//T_APP_TM 投保日期
    /** */
    private String COprTyp;//C_OPR_TYP 保单号生成方式,'0' 自动,'1' 手动
    /** */
    private String CPrnNo;//C_PRN_NO 印刷号
    /** */
    private Date TInsrncBgnTm;//T_INSRNC_BGN_TM 保险起期
    /** */
    private Date TInsrncEndTm;//T_INSRNC_END_TM 保险止期
    /** */
    private String CTmSysCde;//C_TM_SYS_CDE 时制(0-24时/12-12时)
    /** */
    private String CUnfixSpc;//C_UNFIX_SPC 非固定特别约定
    /** */
    private String CGrpMrk;//C_GRP_MRK 团单标志('0'个单;'1'团单)
    /** */
    private String CListorcolMrk;//C_LISTORCOL_MRK 清单/汇总标志('0'输入清单,'1'输入汇总  ; )
    /** */
    private String CMasterMrk;//C_MASTER_MRK 统括保单标志
    /** */
    private String CPkgMrk;//C_PKG_MRK 套餐标志'0'否,'1'是
    /** */
    private String CPkgNo;//C_PKG_NO 套餐编号
    /** */
    private String CRegMrk;//C_REG_MRK 记名标志:'0'不记名;'1'记名
    /** */
    private String CDecMrk;//C_DEC_MRK 法定申报标志(0非申报;1申报)
    /** */
    private String CJuriCde;//C_JURI_CDE 司法管辖代码
    /** */
    private String CAgriMrk;//C_AGRI_MRK 涉农标志
    /** */
    private String CForeignMrk;//C_FOREIGN_MRK 境内外标志(0:境内;1:境外)
    /** */
    private String CImporexpMrk;//C_IMPOREXP_MRK
    /** */
    private String CManualMrk;//C_MANUAL_MRK 手工出单标志(0非手工1手工)
    /** */
    private String CInstMrk;//C_INST_MRK 分期付款标志
    /** */
    private String CVipMrk;//C_VIP_MRK VIP标志
    /** */
    private String COpenCoverNo;//C_OPEN_COVER_NO 预约协议
    /** */
    private String CDisptSttlCde;//C_DISPT_STTL_CDE 诉讼方式
    /** */
    private String CDisptSttlOrg;//C_DISPT_STTL_ORG 仲裁机构
    /** */
    private String COprCde;//C_OPR_CDE 操作员代码
    /** */
    private Date TOprTm;//T_OPR_TM 操作日期
    /** */
    private String CChkCde;//C_CHK_CDE 复核人代码
    /** */
    private Date TIssueTm;//T_ISSUE_TM 签单日期
    /** */
    private Date TUdrTm;//T_UDR_TM 核保日期
    /** */
    private String CUdrDptCde;//C_UDR_DPT_CDE 核保机构
    /** */
    private String CUdrCde;//C_UDR_CDE 核保人代码
    /** */
    private String CUdrMrk;//C_UDR_MRK 核保标志
    /** */
    private String CRiFacMrk;//C_RI_FAC_MRK 临分标志
    /** */
    private Date TNextEdrBgnTm;//T_NEXT_EDR_BGN_TM 批改生效起期
    /** */
    private Date TNextEdrEndTm;//T_NEXT_EDR_END_TM 批改生效止期
    /** */
    private Date TNextEdrUdrTm;//T_NEXT_EDR_UDR_TM 下次批改核保日期
    /** */
    private String CRemark;//C_REMARK 备注
    /** */
    private String CLatestMrk;//C_LATEST_MRK 是否最新保单'0'否,'1'是

    /** */
    private Date TEdrAppTm;//T_EDR_APP_TM 批改申请日期
    /** */
    private Date TEdrBgnTm;//T_EDR_BGN_TM 批改生效起期
    /** */
    private Date TEdrEndTm;//T_EDR_END_TM 批改生效止期
    /** */
    private String CEdrMrk;//C_EDR_MRK 申请类型,1 内部批单，2 客户申请
    /** */
    private String CEdrType;//C_EDR_TYPE 批改类型,1 一般批改，2 注销，3退保  4、组合批改  5 满期返还  9 批单撤销
    /** */
    private Double NAmtVar;//N_AMT_VAR	NUMBER 保额变化，批单保额-上一批单（保单）保额
    /** */
    private Double NCalcPrmVar;//N_CALC_PRM_VAR 计算保费变化
    /** */
    private Double NPrmVar;//N_PRM_VAR 保费变化，批单保费上一批单（保单）保费
    /** */
    private Double NIndemLmtVar;//N_INDEM_LMT_VAR 赔偿限额变化
    /** */
    private String CAppPrsnCde;//C_APP_PRSN_CDE 申请人代码
    /** */
    private String CAppPrsnNme;//C_APP_PRSN_NME 申请人名称
    /** */
    private String CEdrCtnt;//C_EDR_CTNT 批文

    private Double NBefEdrAmt;//N_BEF_EDR_AMT 批改前保额

    private Double NBefEdrPrm;//N_BEF_EDR_PRM 批改前保费

    private String COcPlyNo;//C_OC_PLY_NO 开口保单业务的预约保单号

    private Double NRate;//N_RATE  整张保单的费率

    private String CEdrRsnBundleCde;//C_EDR_RSN_BUNDLE_CDE 批改原因或组合代码

    private String CEdrRsnDetail; //C_EDR_RSN_DETAIL 批改原因详细

    private Long NBefEdrPrjNo;//N_BEF_EDR_PRJ_NO 批改业务原保单记录序批改号 ;

    /** */
    private String CCrtCde;//C_CRT_CDE 创建人员
    /** */
    private Date TCrtTm;//T_CRT_TM 创建时间
    /** */
    private String CUpdCde;//C_UPD_CDE 修改人员
    /** */
    private Date TUpdTm;//T_UPD_TM 修改时间
    /** */
    private String CResvTxt1;//C_RESV_TXT_1	 原始申请单号
    /** */
    private String CResvTxt2;//C_RESV_TXT_2	 预留
    /** */
    private String CResvTxt3;//C_RESV_TXT_3	 预留
    /** */
    private String CResvTxt4;//C_RESV_TXT_4	 预留

    private String CBidMrk = "0";//C_BID_MRK 投标业务标志'

    private Double NDiscRate;

    private String CTrdCde;

    private String CResvTxt5;//新添加的“占用性质”字段

    public String CBJPlateMrk = "0";//是否北京0326平台计算前的保单 1是  0不是

    // 2010-09-17 新添加免赔说明 免赔率 免赔额字段
    private Double NDductRate;// 免赔率

    private String CDductDesc;// 免赔说明

    private Double NDductAmt;// 免赔额

    // 2010-12-13 新添加 临分意见
    private String CRiFacOpn; // 临分意见
    // 2020-1-10
    private String CRiFacFbkOpn; // 临分反馈意见

    /** */
    private Double NCiOwnAmt;
    /** */
    private Double NCiOwnPrm;

    private String CSurFormula;

    /**
     * 是否倒签单 空/0: 非倒签单     1:正常倒签单        9:系统对接异常导致的倒签单
     */
    private String CCallBack;
    /**
     * 批次序号
     */
    private String CBatchSeqNo;

    //以下为新添增字段
    private Double NMaxFeeProp;
    private String CFinTyp;
    private Long NOrigTimes;
    private String CSlsId;
    private String CSlsTel;
    private String CSlsNme;
    private String CSalegrpCde;
    private String CDptAttr;
    private String CVipCus;
    private String CGrantDptCde;
    private String CMinUndrDpt;
    private String CMinUndrCls;
    private String CFeeCalTyp;
    private String CRateNo;
    private String CSaveMrk;
    private Double NBefEdrSaving;
    private Double NSavingVar;
    private String CCommonFlag;
    private String CImmeffMrk;//即时生效
    private String CDataSrc;//数据来源
    //add 显示平台退保公式liuq
    private String SurrenderFormula;
    private String CResvTxt6;
    private String CResvTxt7;
    private String CResvTxt8;

    /*一家系统 添加新字段*/
    private Double NAllPrm;
    private Double NIrrRatio;
    private String CQuotaMrk;
    private String CSusBusiness;
    private Double NBasePrm;
    private String CTransMrk;//数据迁移标志 1 是迁移的老数据

    private String CChaType;//C_CHA_TYPE 渠道中级分类
    private String CChaSubtype;//C_CHA_SUBTYPE 渠道子类
    private String CBrkSlsCde;//代理业务员
    private String CBrkSlsName;

    ///报停展期 添加字段 zhanghj
    private Date TSrcInsrncBgnTm;//原始保单起期
    private Date TSrcInsrncEndSTm;//原始保单止期
    private String CRepstopextStatus;//
    private String CRepstopextSrcAppNo;//
    private Date TTransTm;

    private Date TRunBgnTm;
    private Date TRunEndTm;
    private String CDanzhengTyp;   //非车险单证类型  add by baidong 2011-11-14
    private String CCertfNo;
    private Double NSurrRate;// 非车退保费率
    private Double NPayNum;     // 非车缴费期数

    //060039新添字段

    private Double NResvNum1;
    private Double NResvNum2;
    private Double NResvNum3;

    /**
     * 激活卡系统添加字段,add by xiongzhe,2012-12-31 start
     */
    private String CCardNo;//激活卡号
    private String CBillNo;//结算单号
    private String CCardPlanNo;//激活卡方案号
    private String CCardPlanNme;//激活卡方案名称
    private String CCardBsnsTyp;//激活卡业务来源
    private String CCardMrk;//激活卡标志
    /**激活卡系统添加字段,add by xiongzhe,2012-12-31 end*/

    /**
     * 涉外货运险,出单日期,2013-2-4 start
     */
    private Date TProvPlyTm;//涉外货运险出单日期
    /**
     * 涉外货运险,出单日期,2013-2-4 end
     */

    //ruiwang 2013-2-17 项目大类、项目中类、项目子类
    private String CPrjCtgTyp;//项目大类
    private String CPrjCtgMidTyp;//项目中类
    private String CPrjCtgSubTyp;//项目子类
    //chencj 2013.02.23
    private String CIntroDptcde;    //服务机构(业务介绍机构)
    private String CIntroSalecde;    //服务机构业务员(业务介绍业务员)
    /**
     * 批改短语费率类型
     */
    private String CEdrRatioTyp;

    private String CSlsDpdcde; //业务员归属机构
    /**
     * c_brkr_dptcde  代理业务员机构 add by 20140523
     */
    private String CBrkrDptCde;
    private Double NRefundPrm;// 非车退保费

    /**
     * 消贷险添加.start
     */
    private String CChannelCde;//渠道代码
    private String CChannelComCde;//渠道网点代码
    /**消贷险添加.end*/

    /**
     * E-Cargo添加字段.start
     */
    private String CAgreeNo;        //协议号-VARCHAR2(500)
    private String CAgreeTyp;        //协议类型-CHAR(1)
    private String CRiskLvlCde;        //风险等级-VARCHAR2(30)
    private String CIsMoneyCanel;    //财务对冲标志-CHAR(1)
    private String CEcargoEdrRsnTxt;    //E-Cargo批改原因-VARCHAR2(4000)
    //private String CIsRiSend;		//是否强制临分-CHAR(1)
    //private String CIsAutoUndr;		//是否自动核保-CHAR(1)
    /**
     * E-Cargo添加字段.end
     */

    //共保打印发票字段,start,2013-12-18
    private String CReceiTitleCde; //发票抬头-cde
    private String CReceiTitleNme; //发票抬头-nme
    //end
    private String CPrmSrc;// 供款方式\保费来源2014-01-06

    /*实际业务产品,修改049900,059900存值错误的问题*/
    private String CSubProdNo;
    //080003产品分A、B款
    private String CCvrgTyp; //条款类型
    private String CBatchNo;
    /*add 2014-10-24*/
    private String CSaleJzjyTyp;//航保集中经营业务
    /*add 2014-12-08*/
    private String CBunTrackInf; //业务跟踪人信息


    private String CRiBesprakOpe;    //预约分保意见
    private String CRiBesprakMrk;  // 预约分保标志

    private Double NJiJntAmt;    //联保总保额
    private Double NJiJntPrm;    //联保总保费
    private String CJiAgtNo;    //联保主协议号
    private String CJiNo;    //主联协议号
    private String CCiOprRel;    //主联录单人联系方式
    private Double NCiOwnShare;//一家方共保比例
    private String CQteNo;//报价单号
    private String CQteTyp;//区分是第三方网站出单(7)还是Ecargo系统出单
    private Double NNotaxPrm;//不含税保费
    private Double NAddedTax;//增值税额
    private Double NNotaxPrmVar;//不含税保费变化值
    private Double NAddedTaxVar;//增值税额变化值
    private String CSpecialmarker;//短意险使用  是否合单标志

    private String CUnionMrk;//联合单标志
    private String CTaxTyp;//税种 BT-营业税  VAT-增值税
    private String CCollTyp;//征收类型 1-免税  0-应税

    private Double NNetPrm;//再保净保费
    private Double NNetPrmVar;//再保净保费变化量

    private String CSpecNo; // 特约编号
    /*add 2019-11-21*/
    private String CPrePlyNo; //预生成保单号
    private String CPlyAppNo; // 原保单申请单号
//    private String CCiPlyNo; // 主联保单号
//
//    public String getCCiPlyNo() {
//        return CCiPlyNo;
//    }
//
//    public void setCCiPlyNo(String CCiPlyNo) {
//        this.CCiPlyNo = CCiPlyNo;
//    }

    public String getCSpecialmarker() {
        return CSpecialmarker;
    }

    public void setCSpecialmarker(String cSpecialmarker) {
        CSpecialmarker = cSpecialmarker;
    }

    public String getCUnionMrk() {
        return CUnionMrk;
    }

    public void setCUnionMrk(String cUnionMrk) {
        CUnionMrk = cUnionMrk;
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

    public String getCQteTyp() {
        return CQteTyp;
    }

    public void setCQteTyp(String cQteTyp) {
        CQteTyp = cQteTyp;
    }

    public String getCQteNo() {
        return CQteNo;
    }

    public void setCQteNo(String cQteNo) {
        CQteNo = cQteNo;
    }

    public Double getNCiOwnShare() {
        return NCiOwnShare;
    }

    public void setNCiOwnShare(Double nCiOwnShare) {
        NCiOwnShare = nCiOwnShare;
    }

    public String getCCiOprRel() {
        return CCiOprRel;
    }

    public void setCCiOprRel(String cCiOprRel) {
        CCiOprRel = cCiOprRel;
    }

    public String getCJiNo() {
        return CJiNo;
    }

    public void setCJiNo(String cJiNo) {
        CJiNo = cJiNo;
    }

    public Double getNJiJntAmt() {
        return NJiJntAmt;
    }

    public void setNJiJntAmt(Double nJiJntAmt) {
        NJiJntAmt = nJiJntAmt;
    }

    public Double getNJiJntPrm() {
        return NJiJntPrm;
    }

    public void setNJiJntPrm(Double nJiJntPrm) {
        NJiJntPrm = nJiJntPrm;
    }

    public String getCJiAgtNo() {
        return CJiAgtNo;
    }

    public void setCJiAgtNo(String cJiAgtNo) {
        CJiAgtNo = cJiAgtNo;
    }

    /**
     * 开口保单协议号 与 ocBasevo一致
     */
    private String COcAgrNo;
    /**
     * 开口保单协议批改号 与 ocBasevo一致
     */
    private String COcAgrEdrNo;
    /**
     * 开口保单协议主键号 与 ocBasevo一致
     */
    private String CBaseId;

    private Date TRepstopextBgnTm;//报停展期起期


    private Date TRepstopextEndTm;//报停展期止期

    public Date getTRepstopextBgnTm() {
        return TRepstopextBgnTm;
    }

    public void setTRepstopextBgnTm(Date tRepstopextBgnTm) {
        TRepstopextBgnTm = tRepstopextBgnTm;
    }

    public Date getTRepstopextEndTm() {
        return TRepstopextEndTm;
    }

    public void setTRepstopextEndTm(Date tRepstopextEndTm) {
        TRepstopextEndTm = tRepstopextEndTm;
    }

    public String getCRiBesprakOpe() {
        return CRiBesprakOpe;
    }

    public void setCRiBesprakOpe(String cRiBesprakOpe) {
        CRiBesprakOpe = cRiBesprakOpe;
    }

    public String getCRiBesprakMrk() {
        return CRiBesprakMrk;
    }

    public void setCRiBesprakMrk(String cRiBesprakMrk) {
        CRiBesprakMrk = cRiBesprakMrk;
    }

    public String getCBunTrackInf() {
        return CBunTrackInf;
    }

    public void setCBunTrackInf(String bunTrackInf) {
        CBunTrackInf = bunTrackInf;
    }

    public String getCSaleJzjyTyp() {
        return CSaleJzjyTyp;
    }

    public void setCSaleJzjyTyp(String cSaleJzjyTyp) {
        CSaleJzjyTyp = cSaleJzjyTyp;
    }

    public String getCEdrRatioTyp() {
        return CEdrRatioTyp;
    }

    public void setCEdrRatioTyp(String edrRatioTyp) {
        CEdrRatioTyp = edrRatioTyp;
    }

    public String getCIntroDptcde() {
        return CIntroDptcde;
    }

    public void setCIntroDptcde(String introDptcde) {
        CIntroDptcde = introDptcde;
    }

    public String getCIntroSalecde() {
        return CIntroSalecde;
    }

    public void setCIntroSalecde(String introSalecde) {
        CIntroSalecde = introSalecde;
    }

    public Date getTRunBgnTm() {
        return TRunBgnTm;
    }

    public void setTRunBgnTm(Date runBgnTm) {
        TRunBgnTm = runBgnTm;
    }

    public Date getTRunEndTm() {
        return TRunEndTm;
    }

    public void setTRunEndTm(Date runEndTm) {
        TRunEndTm = runEndTm;
    }

    public Date getTTransTm() {
        return TTransTm;
    }

    public void setTTransTm(Date transTm) {
        TTransTm = transTm;
    }

    public String getCBrkSlsCde() {
        return CBrkSlsCde;
    }

    public void setCBrkSlsCde(String brkSlsCde) {
        CBrkSlsCde = brkSlsCde;
    }

    public String getCChaType() {
        return CChaType;
    }

    public String getCChaSubtype() {
        return CChaSubtype;
    }

    public void setCChaType(String chaType) {
        CChaType = chaType;
    }

    public void setCChaSubtype(String chaSubtype) {
        CChaSubtype = chaSubtype;
    }

    public String getCRiFacOpn() {
        return CRiFacOpn;
    }

    public void setCRiFacOpn(String riFacOpn) {
        CRiFacOpn = riFacOpn;
    }

    public Double getNCiOwnAmt() {
        return NCiOwnAmt;
    }

    public void setNCiOwnAmt(Double ciOwnAmt) {
        NCiOwnAmt = ciOwnAmt;
    }

    public Double getNCiOwnPrm() {
        return NCiOwnPrm;
    }

    public void setNCiOwnPrm(Double ciOwnPrm) {
        NCiOwnPrm = ciOwnPrm;
    }

    public String getCBJPlateMrk() {
        return CBJPlateMrk;
    }

    public void setCBJPlateMrk(String plateMrk) {
        CBJPlateMrk = plateMrk;
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

    public String getSurrenderFormula() {
        return SurrenderFormula;
    }

    public void setSurrenderFormula(String surrenderFormula) {
        SurrenderFormula = surrenderFormula;
    }

    public String getCImmeffMrk() {
        return this.CImmeffMrk;
    }

    public void setCImmeffMrk(String immeffMrk) {
        this.CImmeffMrk = immeffMrk;
    }

    public String getCMinUndrDpt() {
        return CMinUndrDpt;
    }

    public void setCMinUndrDpt(String minUndrDpt) {
//		this.assertThreadAndSession("AbstractBaseVO.TUdrTm",this.CMinUndrDpt,minUndrDpt);
        CMinUndrDpt = minUndrDpt;
    }

    public String getCMinUndrCls() {
        return CMinUndrCls;
    }

    public void setCMinUndrCls(String minUndrCls) {
        CMinUndrCls = minUndrCls;
    }

    public String getCBidMrk() {
        return this.CBidMrk;
    }

    public void setCBidMrk(String bidMrk) {
        this.CBidMrk = bidMrk;
    }

    // Constructors

    /**
     * default constructor
     */
    public AbstractBaseVO() {
    }

    // Property accessors

    public String getCAppNo() {
        return this.CAppNo;
    }

    public void setCAppNo(String CAppNo) {
        this.CAppNo = CAppNo;
    }

    public String getCAppTyp() {
        return this.CAppTyp;
    }

    public void setCAppTyp(String CAppTyp) {
        this.CAppTyp = CAppTyp;
    }

    public String getCPlyNo() {
        return this.CPlyNo;
    }

    public void setCPlyNo(String CPlyNo) {
        this.CPlyNo = CPlyNo;
    }

    public Long getNEdrPrjNo() {
        return this.NEdrPrjNo;
    }

    public void setNEdrPrjNo(Long NEdrPrjNo) {
        this.NEdrPrjNo = NEdrPrjNo;
    }

    public String getCEdrNo() {
        return this.CEdrNo;
    }

    public void setCEdrNo(String CEdrNo) {
        this.CEdrNo = CEdrNo;
    }

    public String getCProdNo() {
        return this.CProdNo;
    }

    public void setCProdNo(String CProdNo) {
        this.CProdNo = CProdNo;
    }

    public String getCDptCde() {
        return this.CDptCde;
    }

    public void setCDptCde(String CDptCde) {
        this.CDptCde = CDptCde;
    }

    public String getCBsnsTyp() {
        return this.CBsnsTyp;
    }

    public void setCBsnsTyp(String CBsnsTyp) {
        this.CBsnsTyp = CBsnsTyp;
    }

    public String getCBsnsSubtyp() {
        return this.CBsnsSubtyp;
    }

    public void setCBsnsSubtyp(String CBsnsSubtyp) {
        this.CBsnsSubtyp = CBsnsSubtyp;
    }

    public String getCBrkrCde() {
        return this.CBrkrCde;
    }

    public void setCBrkrCde(String CBrkrCde) {
        this.CBrkrCde = CBrkrCde;
    }

    public String getCAgtAgrNo() {
        return this.CAgtAgrNo;
    }

    public void setCAgtAgrNo(String CAgtAgrNo) {
        this.CAgtAgrNo = CAgtAgrNo;
    }

    public String getNSubCoNo() {
        return this.NSubCoNo;
    }

    public void setNSubCoNo(String NSubCoNo) {
        this.NSubCoNo = NSubCoNo;
    }

    public Double getNCommRate() {
        return this.NCommRate;
    }

    public void setNCommRate(Double NCommRate) {
        this.NCommRate = NCommRate;
    }

    public String getCRenewMrk() {
        return this.CRenewMrk;
    }

    public void setCRenewMrk(String CRenewMrk) {
        this.CRenewMrk = CRenewMrk;
    }

    public String getCOrigPlyNo() {
        return this.COrigPlyNo;
    }

    public void setCOrigPlyNo(String COrigPlyNo) {
        this.COrigPlyNo = COrigPlyNo;
    }

    public String getCOrigInsurer() {
        return this.COrigInsurer;
    }

    public void setCOrigInsurer(String COrigInsurer) {
        this.COrigInsurer = COrigInsurer;
    }

    public String getCAmtCur() {
        return this.CAmtCur;
    }

    public void setCAmtCur(String CAmtCur) {
        this.CAmtCur = CAmtCur;
    }

    public Double getNAmt() {
        return this.NAmt;
    }

    public void setNAmt(Double NAmt) {
        this.NAmt = NAmt;
    }

    public Double getNAmtRmbExch() {
        return this.NAmtRmbExch;
    }

    public void setNAmtRmbExch(Double NAmtRmbExch) {
        this.NAmtRmbExch = NAmtRmbExch;
    }

    public String getCPrmCur() {
        return this.CPrmCur;
    }

    public void setCPrmCur(String CPrmCur) {
        this.CPrmCur = CPrmCur;
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

    public Double getNPrmRmbExch() {
        return this.NPrmRmbExch;
    }

    public void setNPrmRmbExch(Double NPrmRmbExch) {
        this.NPrmRmbExch = NPrmRmbExch;
    }

    public Double getNIndemLmt() {
        return this.NIndemLmt;
    }

    public void setNIndemLmt(Double NIndemLmt) {
        this.NIndemLmt = NIndemLmt;
    }

    public String getCRatioTyp() {
        return this.CRatioTyp;
    }

    public void setCRatioTyp(String CRatioTyp) {
        this.CRatioTyp = CRatioTyp;
    }

    public Double getNRatioCoef() {
        return this.NRatioCoef;
    }

    public void setNRatioCoef(Double NRatioCoef) {
        this.NRatioCoef = NRatioCoef;
    }

    public Double getNSavingAmt() {
        return this.NSavingAmt;
    }

    public void setNSavingAmt(Double NSavingAmt) {
        this.NSavingAmt = NSavingAmt;
    }

    public String getCPlySts() {
        return this.CPlySts;
    }

    public void setCPlySts(String CPlySts) {
        this.CPlySts = CPlySts;
    }

    public Date getTTermnTm() {
        return this.TTermnTm;
    }

    public void setTTermnTm(Date TTermnTm) {
        this.TTermnTm = TTermnTm;
    }

    public String getCInwdMrk() {
        return this.CInwdMrk;
    }

    public void setCInwdMrk(String CInwdMrk) {
        this.CInwdMrk = CInwdMrk;
    }

    public String getCCiMrk() {
        return this.CCiMrk;
    }

    public void setCCiMrk(String CCiMrk) {
        this.CCiMrk = CCiMrk;
    }

    public String getCCiTyp() {
        return this.CCiTyp;
    }

    public void setCCiTyp(String CCiTyp) {
        this.CCiTyp = CCiTyp;
    }

    public Double getNCiJntAmt() {
        return this.NCiJntAmt;
    }

    public void setNCiJntAmt(Double NCiJntAmt) {
        this.NCiJntAmt = NCiJntAmt;
    }

    public Double getNCiJntPrm() {
        return this.NCiJntPrm;
    }

    public void setNCiJntPrm(Double NCiJntPrm) {
        this.NCiJntPrm = NCiJntPrm;
    }

    public String getCLongTermMrk() {
        return this.CLongTermMrk;
    }

    public void setCLongTermMrk(String CLongTermMrk) {
        this.CLongTermMrk = CLongTermMrk;
    }

    public Date getTAppTm() {
        return this.TAppTm;
    }

    public void setTAppTm(Date TAppTm) {
        this.TAppTm = TAppTm;
    }

    public String getCOprTyp() {
        return this.COprTyp;
    }

    public void setCOprTyp(String COprTyp) {
        this.COprTyp = COprTyp;
    }

    public String getCPrnNo() {
        return this.CPrnNo;
    }

    public void setCPrnNo(String CPrnNo) {
        this.CPrnNo = CPrnNo;
    }

    public Date getTInsrncBgnTm() {
        return this.TInsrncBgnTm;
    }

    public void setTInsrncBgnTm(Date TInsrncBgnTm) {
        this.TInsrncBgnTm = TInsrncBgnTm;
    }

    public Date getTInsrncEndTm() {
        return this.TInsrncEndTm;
    }

    public void setTInsrncEndTm(Date TInsrncEndTm) {
        this.TInsrncEndTm = TInsrncEndTm;
    }

    public String getCTmSysCde() {
        return this.CTmSysCde;
    }

    public void setCTmSysCde(String CTmSysCde) {
        this.CTmSysCde = CTmSysCde;
    }

    public String getCUnfixSpc() {
        return this.CUnfixSpc;
    }

    public void setCUnfixSpc(String CUnfixSpc) {
        this.CUnfixSpc = CUnfixSpc;
    }

    public String getCGrpMrk() {
        return this.CGrpMrk;
    }

    public void setCGrpMrk(String CGrpMrk) {
        this.CGrpMrk = CGrpMrk;
    }

    public String getCListorcolMrk() {
        return this.CListorcolMrk;
    }

    public void setCListorcolMrk(String CListorcolMrk) {
        this.CListorcolMrk = CListorcolMrk;
    }

    public String getCMasterMrk() {
        return this.CMasterMrk;
    }

    public void setCMasterMrk(String CMasterMrk) {
        this.CMasterMrk = CMasterMrk;
    }

    public String getCPkgNo() {
        return this.CPkgNo;
    }

    public void setCPkgNo(String CPkgNo) {
        this.CPkgNo = CPkgNo;
    }

    public String getCRegMrk() {
        return this.CRegMrk;
    }

    public void setCRegMrk(String CRegMrk) {
        this.CRegMrk = CRegMrk;
    }

    public String getCDecMrk() {
        return this.CDecMrk;
    }

    public void setCDecMrk(String CDecMrk) {
        this.CDecMrk = CDecMrk;
    }

    public String getCJuriCde() {
        return this.CJuriCde;
    }

    public void setCJuriCde(String CJuriCde) {
        this.CJuriCde = CJuriCde;
    }

    public String getCAgriMrk() {
        return this.CAgriMrk;
    }

    public void setCAgriMrk(String CAgriMrk) {
        this.CAgriMrk = CAgriMrk;
    }

    public String getCForeignMrk() {
        return this.CForeignMrk;
    }

    public void setCForeignMrk(String CForeignMrk) {
        this.CForeignMrk = CForeignMrk;
    }

    public String getCImporexpMrk() {
        return this.CImporexpMrk;
    }

    public void setCImporexpMrk(String CImporexpMrk) {
        this.CImporexpMrk = CImporexpMrk;
    }

    public String getCManualMrk() {
        return this.CManualMrk;
    }

    public void setCManualMrk(String CManualMrk) {
        this.CManualMrk = CManualMrk;
    }

    public String getCInstMrk() {
        return this.CInstMrk;
    }

    public void setCInstMrk(String CInstMrk) {
        this.CInstMrk = CInstMrk;
    }

    public String getCVipMrk() {
        return this.CVipMrk;
    }

    public void setCVipMrk(String CVipMrk) {
        this.CVipMrk = CVipMrk;
    }

    public String getCOpenCoverNo() {
        return this.COpenCoverNo;
    }

    public void setCOpenCoverNo(String COpenCoverNo) {
        this.COpenCoverNo = COpenCoverNo;
    }

    public String getCDisptSttlCde() {
        return this.CDisptSttlCde;
    }

    public void setCDisptSttlCde(String CDisptSttlCde) {
        this.CDisptSttlCde = CDisptSttlCde;
    }

    public String getCDisptSttlOrg() {
        return this.CDisptSttlOrg;
    }

    public void setCDisptSttlOrg(String CDisptSttlOrg) {
        this.CDisptSttlOrg = CDisptSttlOrg;
    }

    public String getCOprCde() {
        return this.COprCde;
    }

    public void setCOprCde(String COprCde) {
        this.COprCde = COprCde;
    }

    public Date getTOprTm() {
        return this.TOprTm;
    }

    public void setTOprTm(Date TOprTm) {
        this.TOprTm = TOprTm;
    }

    public String getCChkCde() {
        return this.CChkCde;
    }

    public void setCChkCde(String CChkCde) {
        this.CChkCde = CChkCde;
    }

    public Date getTIssueTm() {
        return this.TIssueTm;
    }

    public void setTIssueTm(Date TIssueTm) {
        this.TIssueTm = TIssueTm;
    }

    public Date getTUdrTm() {
        return this.TUdrTm;
    }

    public void setTUdrTm(Date TUdrTm) {
        this.TUdrTm = TUdrTm;
    }

    public String getCUdrDptCde() {
        return this.CUdrDptCde;
    }

    public void setCUdrDptCde(String CUdrDptCde) {
        this.CUdrDptCde = CUdrDptCde;
    }

    public String getCUdrCde() {
        return this.CUdrCde;
    }

    public void setCUdrCde(String CUdrCde) {
        this.CUdrCde = CUdrCde;
    }

    public String getCUdrMrk() {
        return this.CUdrMrk;
    }

    public void setCUdrMrk(String CUdrMrk) {
        this.CUdrMrk = CUdrMrk;
    }

    public String getCRiFacMrk() {
        return this.CRiFacMrk;
    }

    public void setCRiFacMrk(String CRiFacMrk) {
        this.CRiFacMrk = CRiFacMrk;
    }

    public Date getTNextEdrBgnTm() {
        return this.TNextEdrBgnTm;
    }

    public void setTNextEdrBgnTm(Date TNextEdrBgnTm) {
        this.TNextEdrBgnTm = TNextEdrBgnTm;
    }

    public Date getTNextEdrEndTm() {
        return this.TNextEdrEndTm;
    }

    public void setTNextEdrEndTm(Date TNextEdrEndTm) {
        this.TNextEdrEndTm = TNextEdrEndTm;
    }

    public Date getTNextEdrUdrTm() {
        return this.TNextEdrUdrTm;
    }

    public void setTNextEdrUdrTm(Date TNextEdrUdrTm) {
        this.TNextEdrUdrTm = TNextEdrUdrTm;
    }

    public String getCRemark() {
        return this.CRemark;
    }

    public void setCRemark(String CRemark) {
        this.CRemark = CRemark;
    }

    public Date getTEdrAppTm() {
        return this.TEdrAppTm;
    }

    public void setTEdrAppTm(Date TEdrAppTm) {
        this.TEdrAppTm = TEdrAppTm;
    }

    public Date getTEdrBgnTm() {
        return this.TEdrBgnTm;
    }

    public void setTEdrBgnTm(Date TEdrBgnTm) {
        this.TEdrBgnTm = TEdrBgnTm;
    }

    public Date getTEdrEndTm() {
        return this.TEdrEndTm;
    }

    public void setTEdrEndTm(Date TEdrEndTm) {
        this.TEdrEndTm = TEdrEndTm;
    }

    public String getCEdrMrk() {
        return this.CEdrMrk;
    }

    public void setCEdrMrk(String CEdrMrk) {
        this.CEdrMrk = CEdrMrk;
    }

    public String getCEdrType() {
        return this.CEdrType;
    }

    public void setCEdrType(String CEdrType) {
        this.CEdrType = CEdrType;
    }

    /**
     * @return nBefEdrAmt
     */
    public Double getNBefEdrAmt() {
        return this.NBefEdrAmt;
    }

    /**
     * @param befEdrAmt
     */
    public void setNBefEdrAmt(Double befEdrAmt) {
        this.NBefEdrAmt = befEdrAmt;
    }

    /**
     * @return nBefEdrPrm
     */
    public Double getNBefEdrPrm() {
        return this.NBefEdrPrm;
    }

    /**
     * @param befEdrPrm
     */
    public void setNBefEdrPrm(Double befEdrPrm) {
        this.NBefEdrPrm = befEdrPrm;
    }

    public String getCLatestMrk() {
        return this.CLatestMrk;
    }

    public void setCLatestMrk(String CLatestMrk) {
        this.CLatestMrk = CLatestMrk;
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

    public String getCSlsCde() {
        return this.CSlsCde;
    }

    public void setCSlsCde(String slsCde) {
        this.CSlsCde = slsCde;
    }

    /**
     * @return nAmtVar
     */
    public Double getNAmtVar() {
        return this.NAmtVar;
    }

    /**
     * @param amtVar
     */
    public void setNAmtVar(Double amtVar) {
        this.NAmtVar = amtVar;
    }

    /**
     * @return nCalcPrmVar
     */
    public Double getNCalcPrmVar() {
        return this.NCalcPrmVar;
    }

    /**
     * @param calcPrmVar
     */
    public void setNCalcPrmVar(Double calcPrmVar) {
        this.NCalcPrmVar = calcPrmVar;
    }

    /**
     * @return nPrmVar
     */
    public Double getNPrmVar() {
        return this.NPrmVar;
    }

    /**
     * @param prmVar
     */
    public void setNPrmVar(Double prmVar) {
        this.NPrmVar = prmVar;
    }

    /**
     * @return nIndemLmtVar
     */
    public Double getNIndemLmtVar() {
        return this.NIndemLmtVar;
    }

    /**
     * @param indemLmtVar
     */
    public void setNIndemLmtVar(Double indemLmtVar) {
        this.NIndemLmtVar = indemLmtVar;
    }

    /**
     * @return cAppPrsnCde
     */
    public String getCAppPrsnCde() {
        return this.CAppPrsnCde;
    }

    /**
     * @param appPrsnCde
     */
    public void setCAppPrsnCde(String appPrsnCde) {
        this.CAppPrsnCde = appPrsnCde;
    }

    /**
     * @return cAppPrsnNme
     */
    public String getCAppPrsnNme() {
        return this.CAppPrsnNme;
    }

    /**
     * @param appPrsnNme
     */
    public void setCAppPrsnNme(String appPrsnNme) {
        this.CAppPrsnNme = appPrsnNme;
    }

    /**
     * @return cEdrCtnt
     */
    public String getCEdrCtnt() {
        return this.CEdrCtnt;
    }

    /**
     * @param edrCtnt
     */
    public void setCEdrCtnt(String edrCtnt) {
        this.CEdrCtnt = edrCtnt;
    }

    public String getCOcPlyNo() {
        return this.COcPlyNo;
    }

    public void setCOcPlyNo(String ocPlyNo) {
        this.COcPlyNo = ocPlyNo;
    }

    public Double getNRate() {
        return this.NRate;
    }

    public void setNRate(Double rate) {
        this.NRate = rate;
    }

    public String getCEdrRsnBundleCde() {
        return this.CEdrRsnBundleCde;
    }

    public void setCEdrRsnBundleCde(String edrRsnBundleCde) {
        this.CEdrRsnBundleCde = edrRsnBundleCde;
    }

    public Long getNBefEdrPrjNo() {
        return this.NBefEdrPrjNo;
    }

    public void setNBefEdrPrjNo(Long befEdrPrjNo) {
        this.NBefEdrPrjNo = befEdrPrjNo;
    }

    public String getCPkgMrk() {
        return this.CPkgMrk;
    }

    public void setCPkgMrk(String pkgMrk) {
        this.CPkgMrk = pkgMrk;
    }

    public Double getNPrmDisc() {
        return this.NPrmDisc;
    }

    public void setNPrmDisc(Double prmDisc) {
        this.NPrmDisc = prmDisc;
    }

    public Double getNDiscRate() {
        return this.NDiscRate;
    }

    public void setNDiscRate(Double discRate) {
        this.NDiscRate = discRate;
    }

    public Double getNMaxFeeProp() {
        return NMaxFeeProp;
    }

    public void setNMaxFeeProp(Double maxFeeProp) {
        NMaxFeeProp = maxFeeProp;
    }

    public String getCFinTyp() {
        return CFinTyp;
    }

    public void setCFinTyp(String finTyp) {
        CFinTyp = finTyp;
    }

    public Long getNOrigTimes() {
        return NOrigTimes;
    }

    public void setNOrigTimes(Long origTimes) {
        NOrigTimes = origTimes;
    }

    public String getCSlsId() {
        return CSlsId;
    }

    public void setCSlsId(String slsId) {
        CSlsId = slsId;
    }

    public String getCSlsTel() {
        return CSlsTel;
    }

    public void setCSlsTel(String slsTel) {
        CSlsTel = slsTel;
    }

    public String getCSlsNme() {
        return CSlsNme;
    }

    public void setCSlsNme(String slsNme) {
        CSlsNme = slsNme;
    }

    public String getCSalegrpCde() {
        return CSalegrpCde;
    }

    public void setCSalegrpCde(String salegrpCde) {
        CSalegrpCde = salegrpCde;
    }

    public String getCDptAttr() {
        return CDptAttr;
    }

    public void setCDptAttr(String dptAttr) {
        CDptAttr = dptAttr;
    }

    public String getCVipCus() {
        return CVipCus;
    }

    public void setCVipCus(String vipCus) {
        CVipCus = vipCus;
    }

    public String getCGrantDptCde() {
        return CGrantDptCde;
    }

    public void setCGrantDptCde(String grantDptCde) {
        CGrantDptCde = grantDptCde;
    }

    public String getCFeeCalTyp() {
        return CFeeCalTyp;
    }

    public void setCFeeCalTyp(String feeCalTyp) {
        CFeeCalTyp = feeCalTyp;
    }

    public String getCRateNo() {
        return CRateNo;
    }

    public void setCRateNo(String rateNo) {
        CRateNo = rateNo;
    }

    public String getCSaveMrk() {
        return CSaveMrk;
    }

    public void setCSaveMrk(String saveMrk) {
        CSaveMrk = saveMrk;
    }

    public Double getNBefEdrSaving() {
        return NBefEdrSaving;
    }

    public void setNBefEdrSaving(Double befEdrSaving) {
        NBefEdrSaving = befEdrSaving;
    }

    public Double getNSavingVar() {
        return NSavingVar;
    }

    public void setNSavingVar(Double savingVar) {
        NSavingVar = savingVar;
    }

    public String getCCommonFlag() {
        return CCommonFlag;
    }

    public void setCCommonFlag(String commonFlag) {
        CCommonFlag = commonFlag;
    }

    public String getCDataSrc() {
        return CDataSrc;
    }

    public void setCDataSrc(String dataSrc) {
        CDataSrc = dataSrc;
    }

    public String getCTrdCde() {
        return CTrdCde;
    }

    public void setCTrdCde(String trdCde) {
        CTrdCde = trdCde;
    }

    public String getCResvTxt5() {
        return CResvTxt5;
    }

    public void setCResvTxt5(String resvTxt5) {
        CResvTxt5 = resvTxt5;
    }

    public Double getNDductRate() {
        return NDductRate;
    }

    public void setNDductRate(Double dductRate) {
        NDductRate = dductRate;
    }

    public String getCDductDesc() {
        return CDductDesc;
    }

    public void setCDductDesc(String dductDesc) {
        CDductDesc = dductDesc;
    }

    public Double getNDductAmt() {
        return NDductAmt;
    }

    public void setNDductAmt(Double dductAmt) {
        NDductAmt = dductAmt;
    }

    public Double getNAllPrm() {
        return NAllPrm;
    }

    public void setNAllPrm(Double allPrm) {
        NAllPrm = allPrm;
    }

    public Double getNIrrRatio() {
        return NIrrRatio;
    }

    public void setNIrrRatio(Double irrRatio) {
        NIrrRatio = irrRatio;
    }

    public String getCQuotaMrk() {
        return CQuotaMrk;
    }

    public void setCQuotaMrk(String quotaMrk) {
        CQuotaMrk = quotaMrk;
    }

    public String getCSusBusiness() {
        return CSusBusiness;
    }

    public void setCSusBusiness(String susBusiness) {
        CSusBusiness = susBusiness;
    }

    public Double getNBasePrm() {
        return NBasePrm;
    }

    public void setNBasePrm(Double basePrm) {
        NBasePrm = basePrm;
    }

    public String getCTransMrk() {
        return CTransMrk;
    }

    public void setCTransMrk(String transMrk) {
        CTransMrk = transMrk;
    }

    public String getCSurFormula() {
        return CSurFormula;
    }

    public void setCSurFormula(String surFormula) {
        CSurFormula = surFormula;
    }

    //新加字段_yyc 2011-8-18
    private String CNeedfeeFlag; //是否规定见费出单标志
    private String CCanclfeeFlg;//特殊取消见费出单标志
    private String CCanclfeersnCde;//特殊取消见费出单原因

    public String getCNeedfeeFlag() {
        return CNeedfeeFlag;
    }

    public void setCNeedfeeFlag(String needfeeFlag) {
        CNeedfeeFlag = needfeeFlag;
    }

    public String getCCanclfeeFlg() {
        return CCanclfeeFlg;
    }

    public void setCCanclfeeFlg(String canclfeeFlg) {
        CCanclfeeFlg = canclfeeFlg;
    }

    public String getCCanclfeersnCde() {
        return CCanclfeersnCde;
    }

    public void setCCanclfeersnCde(String canclfeersnCde) {
        CCanclfeersnCde = canclfeersnCde;
    }

    public Date getTSrcInsrncBgnTm() {
        return TSrcInsrncBgnTm;
    }

    public Date getTSrcInsrncEndSTm() {
        return TSrcInsrncEndSTm;
    }

    public String getCRepstopextStatus() {
        return CRepstopextStatus;
    }

    public String getCRepstopextSrcAppNo() {
        return CRepstopextSrcAppNo;
    }

    public void setTSrcInsrncBgnTm(Date srcInsrncBgnTm) {
        TSrcInsrncBgnTm = srcInsrncBgnTm;
    }

    public void setTSrcInsrncEndSTm(Date srcInsrncEndSTm) {
        TSrcInsrncEndSTm = srcInsrncEndSTm;
    }

    public void setCRepstopextStatus(String repstopextStatus) {
        CRepstopextStatus = repstopextStatus;
    }

    public void setCRepstopextSrcAppNo(String repstopextSrcAppNo) {
        CRepstopextSrcAppNo = repstopextSrcAppNo;
    }

    public String getCDanzhengTyp() {
        return CDanzhengTyp;
    }

    public void setCDanzhengTyp(String danzhengTyp) {
        CDanzhengTyp = danzhengTyp;
    }

    public String getCCertfNo() {
        return CCertfNo;
    }

    public void setCCertfNo(String certfNo) {
        CCertfNo = certfNo;
    }

    public Double getNSurrRate() {
        return NSurrRate;
    }

    public void setNSurrRate(Double surrRate) {
        NSurrRate = surrRate;
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

    public String getCCardNo() {
        return CCardNo;
    }

    public void setCCardNo(String cardNo) {
        CCardNo = cardNo;
    }

    public String getCBillNo() {
        return CBillNo;
    }

    public void setCBillNo(String billNo) {
        CBillNo = billNo;
    }

    public String getCCardPlanNo() {
        return CCardPlanNo;
    }

    public void setCCardPlanNo(String cardPlanNo) {
        CCardPlanNo = cardPlanNo;
    }

    public String getCCardPlanNme() {
        return CCardPlanNme;
    }

    public void setCCardPlanNme(String cardPlanNme) {
        CCardPlanNme = cardPlanNme;
    }

    public String getCCardBsnsTyp() {
        return CCardBsnsTyp;
    }

    public void setCCardBsnsTyp(String cardBsnsTyp) {
        CCardBsnsTyp = cardBsnsTyp;
    }

    public String getCCardMrk() {
        return CCardMrk;
    }

    public void setCCardMrk(String cardMrk) {
        CCardMrk = cardMrk;
    }

    public Date getTProvPlyTm() {
        return TProvPlyTm;
    }

    public void setTProvPlyTm(Date provPlyTm) {
        TProvPlyTm = provPlyTm;
    }

    public String getCPrjCtgTyp() {
        return CPrjCtgTyp;
    }

    public void setCPrjCtgTyp(String prjCtgTyp) {
        CPrjCtgTyp = prjCtgTyp;
    }

    public String getCPrjCtgMidTyp() {
        return CPrjCtgMidTyp;
    }

    public void setCPrjCtgMidTyp(String prjCtgMidTyp) {
        CPrjCtgMidTyp = prjCtgMidTyp;
    }

    public String getCPrjCtgSubTyp() {
        return CPrjCtgSubTyp;
    }

    public void setCPrjCtgSubTyp(String prjCtgSubTyp) {
        CPrjCtgSubTyp = prjCtgSubTyp;
    }

    public Double getNPayNum() {
        return NPayNum;
    }

    public void setNPayNum(Double payNum) {
        NPayNum = payNum;

    }

    public String getCSlsDpdcde() {
        return CSlsDpdcde;
    }

    public void setCSlsDpdcde(String slsDpdcde) {
        CSlsDpdcde = slsDpdcde;

    }

    public String getCBrkSlsName() {
        return CBrkSlsName;
    }

    public void setCBrkSlsName(String brkSlsName) {
        CBrkSlsName = brkSlsName;

    }

    public String getCChannelCde() {
        return CChannelCde;
    }

    public void setCChannelCde(String channelCde) {
        CChannelCde = channelCde;
    }

    public String getCChannelComCde() {
        return CChannelComCde;
    }

    public void setCChannelComCde(String channelComCde) {
        CChannelComCde = channelComCde;
    }

    public Double getNRefundPrm() {
        return NRefundPrm;
    }

    public void setNRefundPrm(Double refundPrm) {
        NRefundPrm = refundPrm;
    }

    public String getCAgreeNo() {
        return CAgreeNo;
    }

    public void setCAgreeNo(String agreeNo) {
        CAgreeNo = agreeNo;
    }

    public String getCAgreeTyp() {
        return CAgreeTyp;
    }

    public void setCAgreeTyp(String agreeTyp) {
        CAgreeTyp = agreeTyp;
    }

    public String getCRiskLvlCde() {
        return CRiskLvlCde;
    }

    public void setCRiskLvlCde(String riskLvlCde) {
        CRiskLvlCde = riskLvlCde;
    }

    public String getCIsMoneyCanel() {
        return CIsMoneyCanel;
    }

    public void setCIsMoneyCanel(String isMoneyCanel) {
        CIsMoneyCanel = isMoneyCanel;
    }

    public String getCEcargoEdrRsnTxt() {
        return CEcargoEdrRsnTxt;
    }

    public void setCEcargoEdrRsnTxt(String ecargoEdrRsnTxt) {
        CEcargoEdrRsnTxt = ecargoEdrRsnTxt;
    }

    public String getCReceiTitleCde() {
        return CReceiTitleCde;
    }

    public void setCReceiTitleCde(String receiTitleCde) {
        CReceiTitleCde = receiTitleCde;
    }

    public String getCReceiTitleNme() {
        return CReceiTitleNme;
    }

    public void setCReceiTitleNme(String receiTitleNme) {
        CReceiTitleNme = receiTitleNme;
    }

    public String getCPrmSrc() {
        return CPrmSrc;
    }

    public void setCPrmSrc(String prmSrc) {
        CPrmSrc = prmSrc;
    }

    public String getCSubProdNo() {
        return CSubProdNo;
    }

    public void setCSubProdNo(String subProdNo) {
        CSubProdNo = subProdNo;
    }

    public String getCBrkrDptCde() {
        return CBrkrDptCde;
    }

    public void setCBrkrDptCde(String brkrDptCde) {
        CBrkrDptCde = brkrDptCde;
    }

    public String getCCvrgTyp() {
        return CCvrgTyp;
    }

    public void setCCvrgTyp(String cvrgTyp) {
        CCvrgTyp = cvrgTyp;
    }

    public String getCBatchNo() {
        return CBatchNo;
    }

    public void setCBatchNo(String batchNo) {
        CBatchNo = batchNo;
    }

    public String getCTaxTyp() {
        return CTaxTyp;
    }

    public void setCTaxTyp(String cTaxTyp) {
        CTaxTyp = cTaxTyp;
    }

    public String getCCollTyp() {
        return CCollTyp;
    }

    public void setCCollTyp(String cCollTyp) {
        CCollTyp = cCollTyp;
    }

    public String getCOcAgrNo() {
        return COcAgrNo;
    }

    public void setCOcAgrNo(String COcAgrNo) {
        this.COcAgrNo = COcAgrNo;
    }

    public String getCOcAgrEdrNo() {
        return COcAgrEdrNo;
    }

    public void setCOcAgrEdrNo(String COcAgrEdrNo) {
        this.COcAgrEdrNo = COcAgrEdrNo;
    }

    public String getCBaseId() {
        return CBaseId;
    }

    public void setCBaseId(String CBaseId) {
        this.CBaseId = CBaseId;
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

    public String getCEdrRsnDetail() {
        return CEdrRsnDetail;
    }

    public void setCEdrRsnDetail(String cEdrRsnDetail) {
        CEdrRsnDetail = cEdrRsnDetail;
    }

    public String getCSpecNo() {
        return CSpecNo;
    }

    public void setCSpecNo(String cSpecNo) {
        CSpecNo = cSpecNo;
    }

    public String getCPrePlyNo() {
        return CPrePlyNo;
    }

    public void setCPrePlyNo(String CPrePlyNo) {
        this.CPrePlyNo = CPrePlyNo;
    }

    public String getCRiFacFbkOpn() {
        return CRiFacFbkOpn;
    }

    public void setCRiFacFbkOpn(String CRiFacFbkOpn) {
        this.CRiFacFbkOpn = CRiFacFbkOpn;
    }

    public String getCPlyAppNo() {
        return CPlyAppNo;
    }

    public void setCPlyAppNo(String CPlyAppNo) {
        this.CPlyAppNo = CPlyAppNo;
    }

    public String getCCallBack() {
        return CCallBack;
    }

    public void setCCallBack(String CCallBack) {
        this.CCallBack = CCallBack;
    }

    public String getCBatchSeqNo() {
        return CBatchSeqNo;
    }

    public void setCBatchSeqNo(String CBatchSeqNo) {
        this.CBatchSeqNo = CBatchSeqNo;
    }
}
