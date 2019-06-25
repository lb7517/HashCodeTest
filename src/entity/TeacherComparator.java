package entity;

import java.util.Comparator;

//外部比较器
public class TeacherComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
