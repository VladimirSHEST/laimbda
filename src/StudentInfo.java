import java.util.*;

class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc){
        for (Student s : al){
            if(sc.checks(s))
                System.out.println(s);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 25, 1, 4.3);
        Student st2 = new Student("Nata", 'f', 23, 2, 4.1);
        Student st3 = new Student("Vova", 'm', 27, 3, 4.6);
        Student st4 = new Student("Lena", 'f', 26, 2, 4.4);

        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students, st1, st2, st3, st4);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, s -> s.age>25);
        System.out.println("-----------------------");

        info.testStudents(students, (Student x) -> x.course > 2);
        System.out.println("tyjtj");
        System.out.println();
    }
}
interface StudentChecks{
    boolean checks(Student s);
}
