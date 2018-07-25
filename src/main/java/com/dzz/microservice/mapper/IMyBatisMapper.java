package com.dzz.microservice.mapper;

/**
 * MyBatis 接口
 * Created by dangzhizheng on 17/2/27.
 *
 * @param <T>
 * @param <PK>
 */


public interface IMyBatisMapper<T, PK extends java.io.Serializable> {

    /**
     * 保存对象
     *
     * @param entity
     */
    void save(T entity);

    /**
     * 根据主键获取对象
     *
     * @param pk
     * @return
     */
    T get(PK pk);

    /**
     * 更新对象
     *
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除对象
     *
     * @param pk
     * @return
     */
    int delete(PK pk);

    /**
     * 按照时间戳删除记录，删除给定时间之前的记录
     * @param unixtimestamp unix时间戳，精确到秒。
     */
    void deleteByTime(Long unixtimestamp);



}
