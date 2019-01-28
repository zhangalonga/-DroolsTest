package com.us.person;




/**
 * created by zhangalong on 2018/11/9
 */

public class RiskCheckService {


    //查询高危ip的方法
    public static void checkRiskIp(Person person, Teacher teacher) {
        System.out.println("查询高危ip的方法");
    }


    //查询ip首次登陆
    public static void checkIpFirstLogin(Person person, Teacher teacher) {
        System.out.println("查询ip首次登陆");
    }


    //查询信任地
    public static void checkRemoteCity(Person person, Teacher teacher) {
        System.out.println("查询信任地");
    }


    /**
     * 防刷的url
     * 查询配置，并返回命中的配置
     * @return
     */
    public static void checkUserAgent(Person person, Teacher teacher) {
        System.out.println("防刷的url");
    }


}