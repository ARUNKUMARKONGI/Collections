import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }


    /*public int compareTo(Student o) {
        return 0;
    }*/
}

public class TreeSetOnCustomClass {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("Arun", 102));
        treeSet.add(new Student("Akash", 101));
        treeSet.add(new Student("Aatma", 103));

        System.out.println("Sorted Students by ID: " + treeSet);
    }
}
