package com.atguigu.springcloud.entities;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/14 10:51
 */
public class EntryObj {
    private static final long serialVersionUID = 1L;

    private String key;

    private Object value;

    public EntryObj() {
    }

    public EntryObj(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
