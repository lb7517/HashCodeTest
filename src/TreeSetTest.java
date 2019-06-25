import entity.Student;
import entity.TeacherComparable;
import entity.TeacherComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String args[]){
        //Comparable内部比较器
        Set<TeacherComparable> set1 = new TreeSet<>();// 注意必须要实现内部或者外部的比较器
        set1.add(new TeacherComparable("刘老师", 11));
        set1.add(new TeacherComparable("高老师", 3));
        set1.add(new TeacherComparable("彭老师", 7));
        set1.add(new TeacherComparable("盘老师", 7));
        set1.add(new TeacherComparable("和老师", 10));
        Iterator<TeacherComparable> iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            TeacherComparable t = iterator1.next();
            System.out.println("姓名: "+t.getName()+", 编号: "+t.gettId());
        }

        System.out.println("--------------------");

        //外部比较器实现 方式一
        Set<Student> set2 = new TreeSet<>(new TeacherComparator());
        set2.add(new Student("刘老师1", 11));
        set2.add(new Student("高老师1", 3));
        set2.add(new Student("彭老师1", 7));
        set2.add(new Student("盘老师1", 7));
        set2.add(new Student("和老师1", 10));
        Iterator<Student> iterator2 = set2.iterator();
        while (iterator2.hasNext()){
            Student t = iterator2.next();
            System.out.println("姓名: "+t.getName()+", 编号: "+t.getId());
        }

        System.out.println("--------------------");

        //外部比较器实现 方式二
        Set<Student> set3 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
        set3.add(new Student("刘老师2", 11));
        set3.add(new Student("高老师2", 3));
        set3.add(new Student("彭老师2", 7));
        set3.add(new Student("盘老师2", 7));
        set3.add(new Student("和老师2", 10));
        Iterator<Student> iterator3 = set3.iterator();
        while (iterator3.hasNext()){
            Student t = iterator3.next();
            System.out.println("姓名: "+t.getName()+", 编号: "+t.getId());
        }
    }
}
