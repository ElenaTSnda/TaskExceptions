import java.util.ArrayList;
import java.util.List;

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
}
