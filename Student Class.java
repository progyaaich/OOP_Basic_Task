import java.util.ArrayList;

class Student {
    String name;
    String grade;
    ArrayList<String> courses = new ArrayList<>();

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void removeCourse(String course) {
        courses.remove(course);
    }

    void display() {
        System.out.println(name + " (" + grade + ") Courses: " + courses);
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", "A");
        s.addCourse("Math");
        s.addCourse("Physics");
        s.display();

        s.removeCourse("Math");
        s.display();
    }
}
