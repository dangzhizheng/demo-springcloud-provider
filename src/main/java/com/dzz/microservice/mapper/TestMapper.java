/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.dzz.microservice.mapper;

import com.dzz.microservice.entity.ApiTest;

/**
 * Created by dangzhizheng on 2017/9/13.
 */
public interface TestMapper extends IMyBatisMapper<ApiTest, Long> {

    /**
     * 根据id查找
     *
     * @param id
     */
    ApiTest getById(Long id);




}
