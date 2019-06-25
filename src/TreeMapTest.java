import entity.Student;
import entity.TeacherComparator;

import java.util.*;

public class TreeMapTest {

    public static void main(String args[]){
        Map<String, List<Student>> map = new TreeMap();

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("huang", 9));
        list2.add(new Student("tang", 15));
        list2.add(new Student("pan", 8));
        map.put("中班", list2);

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("lb", 11));
        list1.add(new Student("gao", 12));
        map.put("小班", list1);

        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("gun", 9));
        list3.add(new Student("shi", 15));
        list3.add(new Student("mao", 8));
        list3.add(new Student("chou", 44));
        list3.add(new Student("zhou", 66));
        map.put("大班", list3);



        Set<Map.Entry<String, List<Student>>> set = map.entrySet();
        Iterator<Map.Entry<String, List<Student>>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<Student>> tmp = iterator.next();
            List<Student> list = tmp.getValue();
            System.out.println(tmp.getKey()+": "+ list);
        }

        System.out.println("--------------");

        //注意如下类要实现Comparable或Comparator比较接口 方式一
        Map<Student, String> map1 = new TreeMap<>(new TeacherComparator());
        map1.put(new Student("huang", 9), "TreeMap one");
        map1.put(new Student("tang", 5), "TreeMap two");
        map1.put(new Student("lb", 18), "TreeMap three");
        for(Map.Entry<Student, String> entry : map1.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        System.out.println("--------------");

        //注意如下类要实现Comparable或Comparator比较接口 方式二
        Map<Student, String> map2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
        map2.put(new Student("huang", 9), "TreeMap1 one");
        map2.put(new Student("tang", 5), "TreeMap1 two");
        map2.put(new Student("lb", 18), "TreeMap1 three");
        for(Map.Entry<Student, String> entry : map2.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }

}
