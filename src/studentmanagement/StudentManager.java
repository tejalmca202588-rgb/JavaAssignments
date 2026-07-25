package studentmanagement;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    // Display All Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        for (Student student : students) {
            System.out.println("---------------------");
            System.out.println(student);
        }
    }

    // Search Student
    public Student searchStudent(int prn) {

        for (Student student : students) {
            if (student.getPrn() == prn) {
                return student;
            }
        }

        return null;
    }

    // Update Student
    public void updateStudent(int prn, String name, String course) {

        Student student = searchStudent(prn);

        if (student != null) {
            student.setName(name);
            student.setCourse(course);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    // Delete Student
    public void deleteStudent(int prn) {

        Student student = searchStudent(prn);

        if (student != null) {
            students.remove(student);
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found.");
        }
    }
}