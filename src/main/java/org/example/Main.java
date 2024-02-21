package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        // Добавление сотрудников в справочник
        directory.addEmployee(new Employee(1, "123456789", "John", 5));
        directory.addEmployee(new Employee(2, "987654321", "Alice", 3));
        directory.addEmployee(new Employee(3, "456789123", "Bob", 7));

        // Поиск сотрудника по стажу
        List<Employee> experiencedEmployees = directory.findEmployeesByExperience(5);
        System.out.println("Employees with 5 years of experience:");
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee.getName());
        }

        // Поиск номера телефона по имени
        List<String> phoneNumbers = directory.findPhoneNumbersByName("Alice");
        System.out.println("Phone number(s) of Alice:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        // Поиск сотрудника по табельному номеру
        Employee employeeById = directory.findEmployeeById(2);
        if (employeeById != null) {
            System.out.println("Employee with ID 2: " + employeeById.getName());
        } else {
            System.out.println("Employee with ID 2 not found");
        }
    }
}
