package com.atguigu.springcloud.entities.coreVo;


import com.atguigu.springcloud.entities.coreVo.AbstractVo.AbstractFeeVO;

/**
 * PlyFeeVO entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class PlyFeeVO extends AbstractFeeVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8247853292285759438L;
	// Fields

	private String CPlyNo;
	private Long NEdrPrjNo;
	private String CEdrNo;
	private String CLatestMrk;

	// Constructors

	/** default constructor */
	public PlyFeeVO() {
	}

	public String getCPlyNo() {
		return CPlyNo;
	}

	public void setCPlyNo(String plyNo) {
		CPlyNo = plyNo;
	}

	public Long getNEdrPrjNo() {
		return NEdrPrjNo;
	}

	public void setNEdrPrjNo(Long edrPrjNo) {
		NEdrPrjNo = edrPrjNo;
	}

	public String getCEdrNo() {
		return CEdrNo;
	}

	public void setCEdrNo(String edrNo) {
		CEdrNo = edrNo;
	}

	public String getCLatestMrk() {
		return CLatestMrk;
	}

	public void setCLatestMrk(String latestMrk) {
		CLatestMrk = latestMrk;
	}
}