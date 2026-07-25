package studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter PRN: ");
                    int prn = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(prn, name, course);
                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter PRN to Search: ");
                    int searchPrn = sc.nextInt();

                    Student found = manager.searchStudent(searchPrn);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter PRN to Update: ");
                    int updatePrn = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    manager.updateStudent(updatePrn, newName, newCourse);

                    break;

                case 5:

                    System.out.print("Enter PRN to Delete: ");
                    int deletePrn = sc.nextInt();

                    manager.deleteStudent(deletePrn);

                    break;

                case 6:

                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}