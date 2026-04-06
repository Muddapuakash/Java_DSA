public class ObjectArray {
    public static void main(String[] args) {
        Employee e1 = new Employee(001, "Person1");
        Employee e2 = new Employee(002, "Person2");
        Employee e3 = new Employee(003, "Person3");
        Employee e4 = new Employee(004, "Person4");

        Employee[] arr = {e1, e2, e3, e4};

        for(Employee e : arr) {
            System.out.println(e);
        }
    }
}
