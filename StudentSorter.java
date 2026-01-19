import java.util.TreeSet;
import java.util.Set;

public class StudentSorter {
    public static void main(String[] args) {
        // TreeSet automatically sorts elements alphabetically
        Set<String> studentNames = new TreeSet<>();

        // Adding student names to the set
        studentNames.add("Krishnapriya");
        studentNames.add("Arjun");
        studentNames.add("Zayan");
        studentNames.add("Bhavna");
        studentNames.add("Rahul");

        System.out.println("Student list sorted alphabetically:");
        
        // Iterating through the TreeSet to display sorted names
        for (String name : studentNames) {
            System.out.println("- " + name);
        }
    }
}