package com.dzz.microservice.utils;

import org.springframework.context.ApplicationContext;

/**
 * 获取spring context上下文
 */
public class SpringContextUtil {

    private static ApplicationContext context;

    public static void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    public static <T> T getBean(Class<T> object) {
        return context.getBean(object);
    }

    public static Object getBean(String className) {
        return context.getBean(className);
    }
}
