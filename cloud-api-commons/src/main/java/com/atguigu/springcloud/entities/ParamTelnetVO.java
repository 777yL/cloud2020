package com.atguigu.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/14 10:50
 */
public class ParamTelnetVO {
    private static final long serialVersionUID = 1L;
    //本次接口请求的全局变量
    private GlobalParam4Ser globalParam4Ser;
    //交易类型
    private String tradType;
    //渠道报文解析模式
    private String analyzeType;
    //响应信息
    private ResponseVo responseVo;

    //存放各个接口的包装实体
    private List<EntryObj> entryObjList = new ArrayList<EntryObj>();//扩展信息

    public GlobalParam4Ser getGlobalParam4Ser() {
        return globalParam4Ser;
    }

    public void setGlobalParam4Ser(GlobalParam4Ser globalParam4Ser) {
        this.globalParam4Ser = globalParam4Ser;
    }

    public String getTradType() {
        return tradType;
    }

    public void setTradType(String tradType) {
        this.tradType = tradType;
    }

    public String getAnalyzeType() {
        return analyzeType;
    }

    public void setAnalyzeType(String analyzeType) {
        this.analyzeType = analyzeType;
    }

    public ResponseVo getResponseVo() {
        return responseVo;
    }

    public void setResponseVo(ResponseVo responseVo) {
        this.responseVo = responseVo;
    }

    public List<EntryObj> getEntryObjList() {
        return entryObjList;
    }

    @Override
    public String toString() {
        return "ParamTelnetVO{" +
                "globalParam4Ser=" + globalParam4Ser +
                ", tradType='" + tradType + '\'' +
                ", analyzeType='" + analyzeType + '\'' +
                ", responseVo=" + responseVo +
                ", entryObjList=" + entryObjList +
                '}';
    }
}
