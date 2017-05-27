package com.springinaction.knights;

/**
 * Created by Administrator on 2017/5/26.
 */
public class BraveKnight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest=quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
