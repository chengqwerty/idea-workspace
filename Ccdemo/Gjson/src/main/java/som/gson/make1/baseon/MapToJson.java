package som.gson.make1.baseon;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Think on 2017/7/5.
 */
public class MapToJson {
    static class Mdata{
         List<Map<String,String>> data=new ArrayList<>();
    }

    public static void main(String[] args){
        Mdata mdata=new Mdata();
        Map<String,String> a=new HashMap<>();
        Map<String,String> b=new HashMap<>();
        a.put("11","22");
        a.put("12","33");
        mdata.data.add(a);
        b.put("11","22");
        b.put("12","33");
        mdata.data.add(b);
        System.out.println(new Gson().toJson(mdata));
    }
}
