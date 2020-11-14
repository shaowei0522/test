package com.bjpowernode.mybatis.mapper;

import com.bjpowernode.mybatis.bean.Employee;

import java.util.List;

/**
 * @ProjectName: mybatis_exercise
 * @Package: com.bjpowernode.mybatis.mapper
 * @Description: java类作用描述
 * @Author: 王少伟
 * @CreateDate: 2020/11/12 09:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface EmployeeMapper {
    List<Employee> queryAll();
}
