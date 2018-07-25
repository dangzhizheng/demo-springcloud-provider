package com.dzz.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * 一些测试使用的接口
 */
@Service
public class ApiTestServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private TestMapper testMapper;
//
//    public ApiTest apiTestService(Long id) {
//        ApiTest apiTest = testMapper.getById(id);
//        return apiTest;
//    }

    public Map<String, Object> testApiService() {
        Map<String, Object> map = new HashMap<>();
        map.put("server", "microservice-provider");
        return map;
    }

    public Map<String, Object> restTemplateService() {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> params = new HashMap<>();
        params.put("data", "");
        Object object = restTemplate.getForObject("http://192.168.54.2:8888/api/testApi?data={data}", Map.class, params);
        // 返回结果包含请求头等信息
//        Object object = restTemplate.getForEntity("http://192.168.54.2:8888/api/testApi?data=", Map.class);
        map.put("server", object);
        return map;
    }




}
