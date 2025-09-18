class Employee {
    String name, jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double amount) {
        salary += amount;
    }

    void display() {
        System.out.println(name + " (" + jobTitle + ") - Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Alice", "Developer", 50000);
        e.display();
        e.updateSalary(5000);
        e.display();
    }
}
