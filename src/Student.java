public class Student {
    private String name;
    private int grade;
    private int id;

    public Student(String name, int grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public boolean equals(Student other) {
        return this.id == other.id;
    }

    public String toString() {
        return name + " is in " + grade + "th grade.";
    }
}
