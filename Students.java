import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Students {
    private String name;
    ArrayList<String> students = null;

    public Students() {
//        students = new ArrayList<>(); // для блока finally из Task 3
    }

    // Task 1
    public void addingStudents() {
        try{
            students.add("Max");
        } catch (Exception e){
            System.out.println("New element can't be added. The problem is - " + e);
        }
    }

    // Task 2
    public void deletingStudents() throws NullPointerException{
        students.clear();
    }

    // Task 3
    public void settingNewStudent() throws NullPointerException{
        if(students == null){
            throw new NullPointerException();
        }
    }

    // Task 4.1
    public int countingStudents() {
        return countingStudents();
    }

    // Task 4.2
    public void heapMemory() {
        List<Students> group = new ArrayList<>();
        while (true){
            Students st = new Students();
            group.add(st);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students1 = (Students) o;
        return Objects.equals(name, students1.name) &&
                Objects.equals(students, students1.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, students);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
