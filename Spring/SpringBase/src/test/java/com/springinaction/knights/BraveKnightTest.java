package com.springinaction.knights;

import org.mockito.Mockito;
import org.junit.Test;

/**
 * Created by Administrator on 2017/5/26.
 */
public class BraveKnightTest {
    @Test
    public void test1(){
        System.out.println("==========1");
    }

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest=Mockito.mock(Quest.class);
        BraveKnight braveKnight=new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        Mockito.verify(mockQuest,Mockito.times(1)).embark();
    }
}
