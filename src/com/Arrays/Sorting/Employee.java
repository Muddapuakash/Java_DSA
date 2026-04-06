public class Employee {
    int eId;
    String eName;

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName= eName;
    }
    public Employee() {};
    
    @Override
    public String toString(){
        return "Emp [ Id : " + eId + " Name : " + eName + " ]";
    }
}
