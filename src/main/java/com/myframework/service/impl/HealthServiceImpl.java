package com.myframework.service.impl;

import com.myframework.dto.HealthDto;
import com.myframework.entity.Health;
import com.myframework.mapper.HealthMapper;
import com.myframework.service.HealthService;
import com.myframework.util.MD5Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houseyoung on 15/10/11 23:07.
 */
@Service("healthService")
public class HealthServiceImpl implements HealthService {
    @Autowired
    private HealthMapper healthMapper;

    @Override
    public List<HealthDto> listHealth(@Param("keywords") String keywords){
        return healthMapper.listHealth(keywords);
    }

    @Override
    public void insert(@Param("healthDto") HealthDto healthDto){
        healthMapper.insert(healthDto);
    }

    @Override
    public void delete(@Param("id") int id)  {
        healthMapper.delete(id);
    }

    @Override
    public HealthDto queryById(@Param("id") int id) {
        return healthMapper.queryById(id);
    }

    @Override
    public void update(@Param("healthDto") HealthDto healthDto){
        healthMapper.update(healthDto);
    }

    @Override
    public List<HealthDto> listHimself(@Param("studentId") String studentId) {
        return healthMapper.listHimself(studentId);
    }
}
