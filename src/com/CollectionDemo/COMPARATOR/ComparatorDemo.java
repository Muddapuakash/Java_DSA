import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Student student1 = new Student("student1", 102);
        Student student2 = new Student("student2", 123);
        Student student3 = new Student("student3", 102);
        Student student4 = new Student("student4", 122);
        Student student5 = new Student("student5", 90);

        List<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);

        //lamda function
        list.sort((o1,o2)->{
            if(o1.marks!= o2.marks){
                return o1.marks - o2.marks;
            }
            else {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
    }
}
