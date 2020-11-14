package com.bjpowernode.mybatis.test;

import com.bjpowernode.mybatis.bean.Employee;
import com.bjpowernode.mybatis.service.EmployeeService;
import com.bjpowernode.mybatis.service.impl.EmployeeServiceImpl;

import java.util.List;

/**
 * @ProjectName: mybatis_exercise
 * @Package: com.bjpowernode.mybatis.test
 * @Description: java类作用描述
 * @Author: 王少伟
 * @CreateDate: 2020/11/12 09:27
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test01 {


    public static void main(String[] args) {


        EmployeeService employeeService = new EmployeeServiceImpl();

        List<Employee> employees =
                employeeService.queryAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
