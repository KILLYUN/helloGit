package com.work.common.base;

import java.io.Serializable;

/**
 * 基础枚举接口，所有枚举都必须实现此接口
 * @author wmy
 */
public interface BaseEnum<E extends Enum<?>, T extends Serializable> {

    String CODE = "code";
    String KEY = "key";
    String DESC = "desc";

    String getCode();

    T getKey();

    String getDesc();

}
