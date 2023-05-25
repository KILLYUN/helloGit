package com.work.common.base.enums;

import com.work.common.base.BaseEnum;

/**
 * 操作类型枚举
 * @author wmy
 */

public enum OperaterTypeEnum implements BaseEnum<OperaterTypeEnum,String> {
    /**
     *
     */
    LOGIN("login","登录"),
    INSERT("insert","添加"),
    UPDATE("update","修改"),
    SELECT("select","查询"),
    DELETE("delete","逻辑删除"),
    REMOVE("remove","物理删除");

    private final String key;
    private final String desc;

    OperaterTypeEnum(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
