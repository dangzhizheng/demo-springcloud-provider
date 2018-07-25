package com.dzz.microservice.web;

import com.dzz.microservice.service.ApiTestServiceImpl;
import com.xxyy.log.LogUtil;
import com.xxyy.result.JsonResult;
import com.xxyy.result.JsonResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

/**
 * 一些测试使用的接口
 */
@Controller
@RequestMapping(value = "/api")
public class ApiTest {

    @Autowired
    private ApiTestServiceImpl apiTestService;

    @RequestMapping(value = "/testApi", method = RequestMethod.GET)
    @ResponseBody()
    public JsonResult testApi() {
        try {
            LogUtil.info("testApi");
            Map<String, Object> map = apiTestService.testApiService();
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.SUCCESS, map,
                    JsonResultUtil.Code.SUCCESS.message);
        } catch (Exception e) {
            LogUtil.error(getClass(), "操作出错", e);
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.ERROR, "操作出错");
        }
    }

    @RequestMapping(value = "/restTemplate", method = RequestMethod.GET)
    @ResponseBody()
    public JsonResult restTemplate(@RequestParam("data") String data) {
        try {
            LogUtil.info("restTemplate test");
            Map<String, Object> map = apiTestService.restTemplateService();
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.SUCCESS, map,
                    JsonResultUtil.Code.SUCCESS.message);
        } catch (Exception e) {
            LogUtil.error(getClass(), "操作出错", e);
            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.ERROR, "操作出错");
        }
    }

//    @RequestMapping(value = "/apiTest", method = RequestMethod.GET)
//    @ResponseBody()
//    public JsonResult apiTest(@RequestParam("id") String id) {
//        try {
//            LogUtil.info("id:" + String.valueOf(id));
//            ApiTest apiTest = apiTestService.apiTestService(Long.valueOf(id));
//            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.SUCCESS, apiTest,
//                    JsonResultUtil.Code.SUCCESS.message);
//        } catch (Exception e) {
//            LogUtil.error(getClass(), "操作出错", e);
//            return JsonResultUtil.getJsonResult(JsonResultUtil.Code.ERROR, "操作出错");
//        }
//    }




}
