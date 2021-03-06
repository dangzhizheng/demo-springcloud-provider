package com.dzz.microservice.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件的静态类
 * @author dangzhizheng
 */
public class ConfigurationUtil {

    /**
     * property文件
     */
    private static Properties prop = null;

    /**
     * 文件名
     */
    private static final String CONFIG_FILE = "application.properties";

    /**
     * 加载文件
     */
    static {
        prop = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE).openStream();
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(CONFIG_FILE + " is not found");
        } catch (IOException e) {
            throw new RuntimeException(CONFIG_FILE + " is not found");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch blockd
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 根据key获取value
     *
     * @param key 键
     * @return 值
     */
    public static String get(String key) {
        String propertyValue = prop.getProperty(key);
//        LogUtil.debug("ConfigurationManager key:[" + key + "] value:[" + propertyValue + "]");
        return propertyValue;
    }
}
