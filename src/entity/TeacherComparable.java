package entity;

//实现类内部比较器
public class TeacherComparable implements Comparable<TeacherComparable> {

    private String name;

    private int tId;

    public TeacherComparable(String name, int tId){
        this.name = name;
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Override
    public int compareTo(TeacherComparable o) {
        if(this.gettId() > o.gettId()){ //升序
            return 1;
        }else if(this.gettId() == o.gettId()){
            return 0;
        }else {
            return -1;
        }
    }
}
