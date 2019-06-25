import entity.Student;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String args[]){
        Map<Student, String> map = new LinkedHashMap<>();
//        Map<Student, String> map = new LinkedHashMap(2, 0.75f, true);// 注意此种初始化方式
        map.put(new Student("lb", 11), "LinkedHashMap one");
        map.put(new Student("tang", 1), "LinkedHashMap two");
        map.put(new Student("gao", 6), "LinkedHashMap three");
        map.put(new Student("he", 10), "LinkedHashMap four");

        //遍历方式一
        for(Map.Entry<Student, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        System.out.println("---------------");

        //遍历方式二
        Iterator<Map.Entry<Student, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Student, String> tmp = iterator.next();
            System.out.println(tmp.getKey()+", "+tmp.getValue());
        }

    }

}
