package com.atguigu.springcloud.entities;

import java.util.List;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/14 10:51
 */
public class GlobalParam4Ser {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<EntryObj> entryObj;

    public List<EntryObj> getEntryObj() {
        return entryObj;
    }

    public void setEntryObj(List<EntryObj> entryObj) {
        this.entryObj = entryObj;
    }

}
