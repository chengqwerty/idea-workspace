package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/8.
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title="Sgt. Pepper's Lonely hearts Club Band";
    private String artist="The Beatles";

    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
