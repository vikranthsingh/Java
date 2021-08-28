package CodeWithHarry;
class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class JavaConstructors {
    public static void main(String[] args) {
        Employee emp = new Employee(7,"Vikranth", 10000);
        emp.setId(8);
        int id = emp.getId();
        System.out.println("Emp id is : "+id);
        String name = emp.getName();
        System.out.println("Emp name is : "+name);
        int sal = emp.getSalary();
        System.out.println(sal);
    }
}
