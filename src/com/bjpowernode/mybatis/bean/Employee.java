package com.bjpowernode.mybatis.bean;

/**
 * @ProjectName: mybatis_exercise
 * @Package: com.bjpowernode.mybatis.bean
 * @Description: java类作用描述
 * @Author: 王少伟
 * @CreateDate: 2020/11/12 09:15
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Employee {
    private String EMPNO;
    private String ENAME;
    private String JOB;
    private String MGR;
    private String HIREDATE;
    private String SAL;
    private String COMM;
    private String DEPTNO;

    @Override
    public String toString() {
        return "Employee{" +
                "EMPNO='" + EMPNO + '\'' +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR='" + MGR + '\'' +
                ", HIREDATE='" + HIREDATE + '\'' +
                ", SAL='" + SAL + '\'' +
                ", COMM='" + COMM + '\'' +
                ", DEPTNO='" + DEPTNO + '\'' +
                '}';
    }

    public String getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(String EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public String getMGR() {
        return MGR;
    }

    public void setMGR(String MGR) {
        this.MGR = MGR;
    }

    public String getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(String HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public String getSAL() {
        return SAL;
    }

    public void setSAL(String SAL) {
        this.SAL = SAL;
    }

    public String getCOMM() {
        return COMM;
    }

    public void setCOMM(String COMM) {
        this.COMM = COMM;
    }

    public String getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(String DEPTNO) {
        this.DEPTNO = DEPTNO;
    }
}
