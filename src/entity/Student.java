package entity;

public class Student {

    private String name;

    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*@Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        final entity.Student other = (entity.Student)obj;
        if(id != other.getId()){
            return false;
        }
        if(name != other.getName()){
            return false;
        }
        return true;
    }*/
}
