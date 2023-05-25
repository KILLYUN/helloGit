package com.work.common.base.enums;

import com.work.common.base.BaseEnum;

/**
 * 操作机型
 * @author wmy
 */
public enum SystemEnum implements BaseEnum<SystemEnum,String> {
    /**
     *
     */
    PC("pc","电脑端"),
    MOBILE("mobile","手机端");

    private final String key;
    private final String desc;

    SystemEnum(String key, String desc) {
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
