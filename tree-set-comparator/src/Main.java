import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>((student1, student2) -> {
            if(student1.getName().compareTo(student2.getName()) != 0) {
                return student1.getName().compareTo(student2.getName());
            } else return student1.getRollNo() - student2.getRollNo();
        });
        students.add(new Student("Aishik", 1));
        students.add(new Student("Jack", 5));
        students.add(new Student("Cary", 3));
        students.add(new Student("Jack", 4));

        System.out.println(students);
    }
}
