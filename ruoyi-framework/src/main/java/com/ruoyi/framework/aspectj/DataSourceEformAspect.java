package com.ruoyi.framework.aspectj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 多数据源处理，如果
 *
 * @author cxlh
 */
/* 如果要启动eform数据源，请打开注释
/*@Aspect
@Order(2)
@Component*/
public class DataSourceEformAspect {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /* 如果要启动eform数据源，请打开注释
    @Pointcut("execution(* com.ruoyi.web.controller.tool.EForm*.*(..))")
    public void eformPointCut() {
    }

    @Around("eformPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable
    {
        DynamicDataSourceContextHolder.setDateSoureType(DataSourceType.EFORM.name());
        try
        {
            return point.proceed();
        }
        finally
        {
            // 销毁数据源 在执行方法之后
            DynamicDataSourceContextHolder.clearDateSoureType();
        }
    }
    */
}
