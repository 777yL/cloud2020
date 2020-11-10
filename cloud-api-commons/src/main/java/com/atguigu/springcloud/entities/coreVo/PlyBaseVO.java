package com.atguigu.springcloud.entities.coreVo;

import com.atguigu.springcloud.entities.coreVo.AbstractVo.AbstractBaseVO;

/**
 * PlyBaseVO entity.
 *
 * @author jiangqf@isoftstone-ai.com
 */
public class PlyBaseVO extends AbstractBaseVO implements java.io.Serializable {
    // Fields

    /** 批改回退标志 0 无回退/新记录 1 回退记录 2 目的记录 */
    /** CAppNo */
    private String CRevertMrk;
    private String CPrmSts;
    private String CFrzMrk;
    private String CCiInpTyp;//录单方式   600001:主共保全单录入   600002:主共保比例录入   600003：从共保比例录入 
    private String CCiPriTyp;//单证打印方式    602001：全单打印     602002：按共保比例打印
    private String CProdNoOld; //老保单号
    // Constructors

    /**
     *
     */
    private static final long serialVersionUID = -5729663049020301535L;

    /**
     * @return cRevertMrk
     */
    public String getCRevertMrk() {
        return this.CRevertMrk;
    }

    /**
     * @param revertMrk cRevertMrk置入值
     */
    public void setCRevertMrk(String revertMrk) {
        this.CRevertMrk = revertMrk;
    }

    /** default constructor */
    public PlyBaseVO() {
    }

    public void setCPrmSts(String prmSts) {
        this.CPrmSts = prmSts;
    }

    public String getCFrzMrk() {
        return this.CFrzMrk;
    }

    public void setCFrzMrk(String frzMrk) {
        this.CFrzMrk = frzMrk;
    }

    public String getCPrmSts() {
        return this.CPrmSts;
    }

    public String getCCiInpTyp() {
        return CCiInpTyp;
    }

    public void setCCiInpTyp(String ciInpTyp) {
        CCiInpTyp = ciInpTyp;
    }

    public String getCCiPriTyp() {
        return CCiPriTyp;
    }

    public void setCCiPriTyp(String ciPriTyp) {
        CCiPriTyp = ciPriTyp;
    }

    public String getCProdNoOld() {
        return CProdNoOld;
    }

    public void setCProdNoOld(String prodNoOld) {
        CProdNoOld = prodNoOld;
    }

}
