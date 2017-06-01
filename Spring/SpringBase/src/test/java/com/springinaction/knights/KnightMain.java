package com.springinaction.knights;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/31.
 */
public class KnightMain {
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Before
    public void before(){
        classPathXmlApplicationContext=new ClassPathXmlApplicationContext("knights.xml");
    }

    @After
    public void after(){
        classPathXmlApplicationContext.close();
    }

    @Test
    public void test1(){
        BraveKnight braveKnight=(BraveKnight)classPathXmlApplicationContext.getBean("knight");
        braveKnight.embarkOnQuest();
    }
}
