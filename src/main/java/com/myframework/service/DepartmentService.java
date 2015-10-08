package com.myframework.service;

import com.myframework.dto.DepartmentDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by houseyoung on 15/10/8 22:29.
 */
public interface DepartmentService {
    public List<DepartmentDto> listDepartment(@Param("keywords") String keywords);

    public void insert(@Param("departmentDto") DepartmentDto departmentDto);

    public void delete(@Param("id") int id);

    public DepartmentDto queryById(@Param("id") int id);

    public void update(@Param("departmentDto") DepartmentDto departmentDto);
}
