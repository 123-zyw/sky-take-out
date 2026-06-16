package com.sky.annotation;

import com.sky.enumeration.OperationType; // 1. 引入外部独立的枚举类
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识需要自动填充公共字段的方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 2. 直接指定返回类型为外部的枚举类，不需要再定义任何内部类/接口
    OperationType value();
}