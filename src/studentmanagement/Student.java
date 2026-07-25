package studentmanagement;

public class Student {

    private int prn;
    private String name;
    private String course;

    public Student(int prn, String name, String course) {
        this.prn = prn;
        this.name = name;
        this.course = course;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "PRN : " + prn +
               "\nName : " + name +
               "\nCourse : " + course;
    }
}