package som.gson.make2;

import com.google.gson.Gson;
import org.junit.Test;
import som.gson.make2.baseon.Road;

/**
 * Created by Administrator on 2017/6/9.
 */
public class ArrayToJson {

    /**
     * 直接把{1,2,3,4,5}这样的数组转化为json
     * 可以看到转化后的json字符串是[1,2,3,4,5]
     */
    @Test
    public void test1(){
        Gson gson=new Gson();
        int[] abc={1,2,3,4,5};
        String json=gson.toJson(abc);
        System.out.println(json);
    }

    /**
     * Road中有一个abc的int数组，然后转化为json
     */
    @Test
    public void test2(){
        Gson gson=new Gson();
        Road road=new Road();
        int[] abc={1,2,3,4,5};
        road.setAbc(abc);
        String json=gson.toJson(road);
        System.out.println(json);
    }

    /**
     *Road中的值都是空的，转化后json也是空的
     */
    @Test
    public void test3(){
        Gson gson=new Gson();
        Road road=new Road();
        String json=gson.toJson(road);
        System.out.println(json);
    }
}
