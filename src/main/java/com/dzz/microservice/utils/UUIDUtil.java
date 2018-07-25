package com.dzz.microservice.utils;


import java.util.UUID;

/**
 * 生成服务的唯一识别码
 * @author dangzhizheng
 */
public class UUIDUtil {

    // uuid的唯一识别码
    private static final String uniqueId;

    // hostName的唯一识别码
    private static final String serverName;

    static {
        uniqueId = getARandomUUID();
        serverName = WebUtil.getServerName();
    }

    /**
     * 用于获取服务的唯一识别码
     * @return
     */
    public static String getUniqueId () {
        if (serverName != null && !WebUtil.DEFAULT_SERVER_NAME.equals(serverName)) {
            return serverName;
        } else {
            return uniqueId;
        }
    }

    public static String getARandomUUID () {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
