import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    private ArrayList<Student> roster;

    public Classroom() {
        // Create the roster
        roster = new ArrayList<Student>();
    }

    /**
     * Adds a student if they are not already
     * in the roster
     * @param s The student to add
     * @return True if added successfully, false otherwise
     */
    public boolean addStudent(Student s) {
        // Check if a student with this id already exists
        for(Student student : this.roster) {
            if(s == student) {
                return false;
            }
        }

        this.roster.add(s);
        return true;
    }

    /**
     * Asks the user who they want to remove and
     * removes that student
     * @param
     * @return
     */
    public void removeStudent() {
        // Ask the user who to remove
        Scanner input = new Scanner(System.in);
        System.out.println("Who do you want to remove?");
        String name = input.nextLine();

        // Find and remove that student
        for(Student s : this.roster) {
            if(s.getName().equals(name)) {
                removeStudent(s);
                System.out.println("Removed!");
                return;
            }
        }

        System.out.println("No student by that name was found.");
    }

    private Student removeStudent(Student s) {
        // Find that student
        for(int i=0; i<this.roster.size(); i++) {
            if(this.roster.get(i).equals(s)) {
                // Return the removed student
                return this.roster.remove(i);
            }
        }

        // Return null otherwise
        return null;
    }

    public void printStudents() {
        for(Student s : this.roster) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        // Create a new classroom
        Classroom cs2 = new Classroom();

        // Fill it with students
        Student s1 = new Student("John", 10, 123);
        Student s2 = new Student("Paul", 9, 124);
        Student s3 = new Student("George", 11, 125);
        Student s4 = new Student("Ringo", 12, 126);
        Student s5 = new Student("Pete", 10, 123);

        // Add the students
        cs2.addStudent(s1);
        cs2.addStudent(s2);
        cs2.addStudent(s3);
        cs2.addStudent(s4);
        cs2.addStudent(s5);

        // Print the students
        cs2.printStudents();

        // Ask the user who to remove
        cs2.removeStudent();

        // Print the students
        cs2.printStudents();
    }
}
