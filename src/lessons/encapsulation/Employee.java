package lessons.encapsulation;

public class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String title, int amountOfEmployees){
        this.name = name;
        this.department = new Department(title, amountOfEmployees);
    }

}
