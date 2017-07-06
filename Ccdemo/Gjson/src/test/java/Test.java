import com.google.gson.Gson;

/**
 * Created by Think on 2017/7/5.
 */
public class Test {
    public static void main(String[] args){
        Mdata mdata=new Mdata();
        for(int i=0;i<17;i++){
            Gdata gdata=new Gdata();
            gdata.setC0003_stname(Integer.toString(i));
            gdata.setC0007_pname(Integer.toString(i));
            mdata.data.add(gdata);
        }
        System.out.println(new Gson().toJson(mdata));
    }
}
