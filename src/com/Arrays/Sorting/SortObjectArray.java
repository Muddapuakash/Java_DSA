import java.util.Arrays;

public class SortObjectArray {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101,"emp1");
        Employee emp2 = new Employee(102,"emp2");
        Employee emp3 = new Employee(103,"emp3");
        Employee emp4 = new Employee(104,"emp4");
        Employee emp5 = new Employee(101,"emp5");
        
        Employee[] employees = {emp5,emp2,emp1,emp3,emp4};

        /*for(int i =0;i<employees.length-1;i++){
            for(int j=0;j<employees.length -1 -i;j++){
                if(employees[j].eId > employees[j+1].eId){
                    Employee tempEmp = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1]= tempEmp;
                }
            }
        }*/


        Arrays.sort(employees, (o1,o2) -> o1.eId - o2.eId);
        for(Employee aEmployee : employees){
            System.out.println(aEmployee);
        }
    }
}
