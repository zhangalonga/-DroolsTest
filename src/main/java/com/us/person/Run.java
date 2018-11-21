package com.us.person;


import java.util.Map;

/**
 * created by zhangalong on 2018/11/9
 */
public class Run {

    public static void test(Map<String,Object> map){
         Person person = (Person) map.get("Person");
         Teacher teacher = (Teacher)map.get("Teacher");
        System.out.println(person.getName()+">>>>>>>>");
    }
}
