package com.work.common.base.aop;

import com.work.common.base.annotations.UserOperaterLog;
import com.work.common.base.enums.OperaterTypeEnum;
import com.work.common.base.enums.SystemEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * UserOperaterAspect
 * 用户操作切面类
 * @author wmy
 * @date 2023/4/13 13:53
 */
@Aspect
@Component
public class UserOperaterAspect {

    @Pointcut(value="@annotation(com.work.common.base.annotations.UserOperaterLog)")
    private void pointCut(){}

    @Around("pointCut()")
    public Object note(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();

        Signature pointSignature = point.getSignature();
        MethodSignature ms = null;
        if( null != pointSignature){
            ms = (MethodSignature) pointSignature;
        }
        Method method = ms.getMethod();
        String methodName = method.getName();
        String args = Arrays.toString(point.getArgs());
        UserOperaterLog log = method.getAnnotation(UserOperaterLog.class);
        boolean open = log.open();
        SystemEnum chancal = log.chancal();
        OperaterTypeEnum operaterTypeEnum = log.operaterType();
        String s = log.moduleName();
        boolean b = log.respBody();
        String moduleName = log.moduleName();
        System.out.println(methodName+":"+args+":+++"+operaterTypeEnum);
        return result;
    }
}
