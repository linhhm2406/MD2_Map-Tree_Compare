import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A",30,"HN");
        Student student2 = new Student("A",26,"HN");
        Student student3 = new Student("A",31,"HN");
        Student student4 = new Student("A",14,"HN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        Collections.sort(lists);
        for (Student st : lists){
            st.displayStudent();
        }

        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName() > o2.getName()) ? 1 : -1;
            }
        });
    }
}
