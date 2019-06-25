import entity.Student;

import java.util.*;

public class HashCodeT {
    public static void main(String args[]){
        Student stu1 = new Student("lb", 11);
        Student stu2 = new Student("lb", 11);
        Student stu3 = stu1;
        System.out.println(stu1.equals(stu2));

        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        //注意正常情况是，set中不能存储两个对象equals相等的对象，默认情况是equals相等hashcode()一定相等
        System.out.println("set: "+set);

        Map<String, Student> map = new HashMap<>();
        map.put("lb", stu1);
        map.put("gao", stu2);
        map.put("tang", stu3);
        Set<String> set1 = map.keySet();
        System.out.println(set1);
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");


        Set<Map.Entry<String, Student>> set2 = map.entrySet();//注意此处的写法
        System.out.println(set2);
        Iterator<Map.Entry<String, Student>> iterator1 = set2.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Student> map1 = iterator1.next();
            System.out.println("id: "+map1.getKey()+", name: "+map1.getValue());
        }
    }
}
