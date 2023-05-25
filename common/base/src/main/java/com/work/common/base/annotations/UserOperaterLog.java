package com.work.common.base.annotations;

import com.work.common.base.enums.OperaterTypeEnum;
import com.work.common.base.enums.SystemEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用户操作注解
 * @author wmy
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserOperaterLog {

    /**
     * 是否启用
     */
    boolean open() default true;
    /**
     * 系统类型
     */
    SystemEnum chancal() default SystemEnum.PC;

    /**
     * 模块名称
     */
    String moduleName() default "";

    /**
     * 操作类型
     */
    OperaterTypeEnum operaterType() default OperaterTypeEnum.LOGIN;

    /**
     * 是否记录响应参数
     */
    boolean respBody() default true;

}
