package som.gson.make1;

import com.google.gson.Gson;
import org.junit.Test;
import som.gson.make1.baseon.Road;

/**
 * Created by Administrator on 2017/6/9.
 */
public class RoadToJson {
    @Test
    public void test1(){
        Gson gson=new Gson();
        Road road=new Road();
        road.setId("1111");
        String json=gson.toJson(road);
        System.out.println(json);
    }
}
