package com.dzz.microservice.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ip操作类
 * @author dangzhizheng
 */
public class WebUtil {

    public static final String DEFAULT_SERVER_IP = "UnkownServerIP";

    public static final String DEFAULT_SERVER_NAME = "UnkownServerName";

    /**
     * 获取本机ip地址
     */
    public static final String getServerIP() {
        String serverIp = DEFAULT_SERVER_IP;
        try {
            InetAddress address = InetAddress.getLocalHost();
            serverIp = address.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return serverIp;
        }
        return serverIp;
    }

    /**
     * 获取本机名称
     */
    public static final String getServerName() {
        String serverName = DEFAULT_SERVER_NAME;
        try {
            InetAddress address = InetAddress.getLocalHost();
            serverName = address.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return serverName;
        }
        return serverName;
    }

}
