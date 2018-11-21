package com.us.person;

import org.drools.core.common.QueryElementFactHandle;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


import java.util.HashMap;
import java.util.Map;

/**
 * created by zhangalong on 2018/10/30
 */
public class Test1 {
    static KieSession getSession(){
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        return container.newKieSession("simpleRuleKSession");
    }

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        KieSession ks = getSession();
        Person p1 = new Person("阿里", 23);
         Teacher teacher = new Teacher("腾讯", 23);


        Map map = new HashMap<String,Object>();
        map.put("Person",p1);
        map.put("Teacher",teacher);
        map.put("result",new Result(true));
         ks.insert(map);

        int i = ks.fireAllRules();
        System.out.println("总共执行了=="+i+"条规则");
        System.out.println("after p1 : " + p1);
        System.out.println(map.get("result"));
         Result R =  (Result)map.get("result");
        System.out.println(R.toString());
        if (!R.isTemp()){
            System.out.println("=====================");
        }

        ks.dispose();
    }

}
