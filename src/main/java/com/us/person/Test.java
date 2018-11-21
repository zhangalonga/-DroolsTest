package com.us.person;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * created by zhangalong on 2018/10/26
 */
public class Test {
    static KieSession getSession(){
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        return container.newKieSession("simpleRuleKSession");
    }

    public static void main(String[] args) {
        //run();
        System.out.println(System.currentTimeMillis());
    }

    public static void run(){
        KieSession ks = getSession();
        Person p1 = new Person("阿里", 68);
        Person p2 = new Person("腾讯", 32);
        Person p3 = new Person("百度", 18);
        Person p4 = new Person("抖音", 8);
        Person p5 = new Person("美团", 66);
        System.out.println("前p1==="+p1);
        System.out.println("前p2==="+p2);
        System.out.println("前p3==="+p3);
        System.out.println("前p4==="+p4);
        System.out.println("前p5==="+p5);
        ks.insert(p1);
        ks.insert(p2);
        ks.insert(p3);
        ks.insert(p4);
        ks.insert(p5);
        int i = ks.fireAllRules();
        System.out.println("总共执行了=="+i+"条规则");
        System.out.println("after p1 : " + p1);
        System.out.println("after p2 : " + p2);
        System.out.println("after p3 : " + p3);
        System.out.println("after p4 : " + p4);
        System.out.println("after p4 : " + p5);
        ks.dispose();
    }

}
