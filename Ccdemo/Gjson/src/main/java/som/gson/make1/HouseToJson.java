package som.gson.make1;

import com.google.gson.Gson;
import org.junit.Test;
import som.gson.make1.baseon.House;

/**
 * Created by Administrator on 2017/6/9.
 */
public class HouseToJson {

    /**
     * house中包含一个computer的对象，可以看到computer是空的时候
     * 把house转化为json是没有computer这个属性的。
     */
    @Test
    public void test1(){
        Gson gson=new Gson();
        House house=new House();
        house.setId(3);
        String json=gson.toJson(house);
        System.out.println(json);
    }
}
