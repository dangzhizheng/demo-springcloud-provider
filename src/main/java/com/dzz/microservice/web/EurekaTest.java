package com.dzz.microservice.web;

import com.xxyy.log.LogUtil;
import com.xxyy.result.JsonResult;
import com.xxyy.result.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 测试Eureka接口
 * @author dangzhizheng
 */
@Controller
@RequestMapping(value = "/api")
public class EurekaTest {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/getEurekaServer", method = RequestMethod.GET)
    @ResponseBody()
    public JsonResult getEurekaServer() {
        try {
            LogUtil.info("getEurekaServerList");
//            获取eureka server list的信息
            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("microservice-provider");
            List<String> serviceList = discoveryClient.getServices();
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.SUCCESS, serviceInstanceList,
                    JsonResultUtil.Code.SUCCESS.message);
        } catch (Exception e) {
            LogUtil.error(getClass(), "操作出错", e);
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.ERROR, "操作出错");
        }
    }




}
