/**
 * Created by Think on 2017/7/2.
 */
public class Gdata {
    public String c0003_stname;
    public String c0037_area_name;
    public String c0070_enterprise_name;
    public String c0007_pname;
    public String g_problem;
    public String content;
    public String c0007_substation_id;

    public String getC0003_stname() {
        return c0003_stname;
    }

    public void setC0003_stname(String c0003_stname) {
        this.c0003_stname = c0003_stname;
    }

    public String getC0037_area_name() {
        return c0037_area_name;
    }

    public void setC0037_area_name(String c0037_area_name) {
        this.c0037_area_name = c0037_area_name;
    }

    public String getC0070_enterprise_name() {
        return c0070_enterprise_name;
    }

    public void setC0070_enterprise_name(String c0070_enterprise_name) {
        this.c0070_enterprise_name = c0070_enterprise_name;
    }

    public String getC0007_pname() {
        return c0007_pname;
    }

    public void setC0007_pname(String c0007_pname) {
        this.c0007_pname = c0007_pname;
    }

    public String getG_problem() {
        return g_problem;
    }

    public void setG_problem(String g_problem) {
        this.g_problem = g_problem;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getC0007_substation_id() {
        return c0007_substation_id;
    }

    public void setC0007_substation_id(String c0007_substation_id) {
        this.c0007_substation_id = c0007_substation_id;
    }

    @Override
    public String toString() {
        return "Gdata{" +
                "c0003_stname='" + c0003_stname + '\'' +
                ", c0037_area_name='" + c0037_area_name + '\'' +
                ", c0070_enterprise_name='" + c0070_enterprise_name + '\'' +
                ", c0007_pname='" + c0007_pname + '\'' +
                ", g_problem='" + g_problem + '\'' +
                ", content='" + content + '\'' +
                ", c0007_substation_id='" + c0007_substation_id + '\'' +
                '}';
    }
}
