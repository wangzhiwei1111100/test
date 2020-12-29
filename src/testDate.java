
import java.util.Date;
import java.util.HashMap;
public class testDate {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
        HashMap<Integer,String>Sites=new HashMap<Integer, String>();
        Sites.put(1,"wzw1");
        Sites.put(2,"wzw2");
        Sites.put(1,"wzw3");
//        Sites.putAll(Sites);
        System.out.println(Sites.get(3));
        System.out.println(Sites);
        System.out.println(Sites.size());
    }
}
