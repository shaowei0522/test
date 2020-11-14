package com.bjpowernode.mybatis.service.impl;

import com.bjpowernode.mybatis.bean.Employee;
import com.bjpowernode.mybatis.mapper.EmployeeMapper;
import com.bjpowernode.mybatis.service.EmployeeService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ProjectName: mybatis_exercise
 * @Package: com.bjpowernode.mybatis.service.impl
 * @Description: java类作用描述
 * @Author: 王少伟
 * @CreateDate: 2020/11/12 09:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class EmployeeServiceImpl implements EmployeeService {

    static {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static SqlSession sqlSession;

    private EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
    @Override
    public List<Employee> queryAll() {


        return employeeMapper.queryAll();
    }
}
