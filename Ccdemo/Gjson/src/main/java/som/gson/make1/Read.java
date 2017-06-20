package som.gson.make1;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import som.gson.make1.baseon.Road;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by qwerthink on 2017/4/12.
 * 从制定路径中读取json文件并解析为java对象，然后修改java对象，
 * 之后把修改后的数据重新写入json文件
 * 常见的json数据都是{}的，中间可能包含数组，最近项目遇到直接就是[]开始的json数据。
 * 这个程序就是处理直接以[]开始的json数据
 */
public class Read {
    private static String path="Gjson/static/json/01-01/"; //文件目录
    private static String fileName;

    /**
     * 重写文件
     * @param json
     * @throws IOException
     */
    public static void write(String json) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        bw.write(json);
        bw.flush();
        bw.close();
    }

    /**
     * 用来循环读取所有文件
     */
    public static void start() {
        StringBuilder lpath=new StringBuilder(); //用来拼接文件完整地址
        int i=1;
        String file;
        while(true){    //循环读取所有文件
            lpath.append(path);
            lpath.append(i+"");
            lpath.append(".json"); //文件名拼接完毕
            fileName=lpath.toString();
            BufferedReader br=null;
            try {
                br=new BufferedReader(new InputStreamReader(new FileInputStream(fileName))); //获取文件输入的BufferedReader
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(0); //如果文件不存在说明循环读取文件完毕，退出程序
            }
            try {
                mount(br);
            } catch (IOException e) {
                e.printStackTrace();
            }
            lpath.setLength(0); //重置读取下一个文件
            i++;
        }
    }

    /**
     * 读取json字符串，转化为java对象，修改java对象然后重写文件
     * @param br
     * @throws IOException
     */
    public static void mount(BufferedReader br) throws IOException {
        String json=br.readLine();
        Type type = new TypeToken<ArrayList<Road>>() {}.getType();
        ArrayList<Road> roads=new Gson().fromJson(json,type);
        for(Road road:roads){
            change(road); //修改对象内容
        }
        String newjson=new Gson().toJson(roads);
        System.out.println(newjson);
        write(newjson); //重写文件
    }

    /**
     * 修改对象
     * @param road
     */
    public static void change(Road road){
        int zoo=0;
        if(Math.floor(Math.random()*2)<1){
            zoo=(int)Math.floor(Math.random()*5);
        }else{
            zoo=(int)Math.floor(Math.random()*5+5);
        }
        road.setCount(zoo);
    }

    /*
        读取json文件，获取jsonObject或者jsonArray
     */
    public static void test() throws FileNotFoundException{
        JsonParser jsonParser=new JsonParser();
        FileReader fr=new FileReader("conf/1.json");
        JsonArray arrayRoot=(JsonArray)jsonParser.parse(fr);
        JsonArray jsonArray=arrayRoot;
        for(int i=0;i<arrayRoot.size();i++){
            System.out.println("---------------");
            JsonObject subObject=jsonArray.get(i).getAsJsonObject();
            System.out.println("id="+subObject.get("id").getAsString());
            System.out.println("no="+subObject.get("No").getAsString());
            System.out.println("count="+subObject.get("count").getAsString());
        }

        System.out.println(jsonArray);
    }

    /*
        程序从这里开始
     */
    public static void main(String[] args){
        start();
    }
}
