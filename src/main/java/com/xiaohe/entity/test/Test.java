package com.xiaohe.entity.test;

import com.xiaohe.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)applicationContext.getBean("User");
        user.Add();
    }
}
