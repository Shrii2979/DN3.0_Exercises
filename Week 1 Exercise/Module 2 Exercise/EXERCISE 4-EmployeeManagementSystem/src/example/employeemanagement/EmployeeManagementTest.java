package example.employeemanagement;

public class EmployeeManagementTest {

	public static void main(String[] args) {
		EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Manager", 80000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 60000));
        ems.addEmployee(new Employee(3, "Charlie", "Designer", 50000));

        // Traversing employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("Search Employee with ID 2:");
        Employee employee = ems.searchEmployee(2);
        System.out.println(employee != null ? employee : "Employee not found");

        // Deleting an employee
        System.out.println("Deleting Employee with ID 2:");
        boolean isDeleted = ems.deleteEmployee(2);
        System.out.println(isDeleted ? "Employee deleted" : "Employee not found");

        // Traversing employees after deletion
        System.out.println("All Employees after deletion:");
        ems.traverseEmployees();
    }

	}

