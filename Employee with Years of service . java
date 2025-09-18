import java.time.LocalDate;
import java.time.Period;

class Employee {
    String name;
    double salary;
    LocalDate hireDate;

    Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int yearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee e = new Employee("Bob", 40000, LocalDate.of(2018, 5, 10));
        System.out.println("Years of Service: " + e.yearsOfService());
    }
}
