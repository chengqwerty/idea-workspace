package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by Administrator on 2017/5/26.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream){
        this.printStream=printStream;
    }

    @Override
    public void embark(){
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
