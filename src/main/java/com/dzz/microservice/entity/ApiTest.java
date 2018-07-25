/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.dzz.microservice.entity;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;

/**
 * CDN
 *
 * Created by dangzhizheng on 2017/9/13.
 */
public class ApiTest implements Serializable {


    // 编号
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private int logicalDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getLogicalDelete() {
        return logicalDelete;
    }

    public void setLogicalDelete(int logicalDelete) {
        this.logicalDelete = logicalDelete;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
