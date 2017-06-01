package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream){
        this.printStream=printStream;
    }

    public void singBeforeQuest(){
        printStream.println("Fa la la,the knight is so brave!");
    }

    public void singAfterQuest(){
        printStream.println("Tee hee hee,the brave knight" +
                "did embark on a quest!");
    }
}
