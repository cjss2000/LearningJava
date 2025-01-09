package lessons.encapsulation;

public class Main {

    public static void main(String[] args) {
        Department department = new Department("IT", 10);

        Employee employee = new Employee("Alice", department);
    }
}
