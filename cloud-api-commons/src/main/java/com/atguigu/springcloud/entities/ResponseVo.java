package com.atguigu.springcloud.entities;

import java.util.List;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/14 10:52
 */
public class ResponseVo {
    private static final long serialVersionUID = 1L;
    private String responseCode;  //响应代码
    private String errorCode;  //错误代码
    private String errorMessage;  //错误说明
    private List<EntryObj> entryObjList; //扩展信息

    public List<EntryObj> getEntryObjList() {
        return entryObjList;
    }

    public void setEntryObjList(List<EntryObj> entryObjList) {
        this.entryObjList = entryObjList;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
