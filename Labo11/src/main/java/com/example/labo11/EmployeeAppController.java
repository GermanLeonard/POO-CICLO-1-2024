package com.example.labo11;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeAppController {

    @FXML
    private Button SortByNameButton;

    @FXML
    private Button SortBySalaryButton;

    @FXML
    private ListView<Employee> listView;
    private List<Employee> employees;

    public void initialize() {
        employees = new ArrayList<>();
        employees.add(new Employee("Marta", 40, 1500.89));
        employees.add(new Employee("Enrique", 35, 500.5));
        employees.add(new Employee("Maria", 32, 450.0));
        employees.add(new Employee("Melissa", 56, 2000.0));
        employees.add(new Employee("Victor", 28, 1200.0));
        employees.add(new Employee("Daniel", 46, 1000.0));
        employees.add(new Employee("Rebeca", 41, 800.0));
        employees.add(new Employee("Eduardo", 25, 1500.89));

        listView.getItems().addAll(employees);
    }

    @FXML
    private void SortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
        listView.getItems().setAll(employees);
        // Logica para ordenar por nombre
    }

    @FXML
    private void SortBySalary() {
        employees.sort(Comparator.comparing(Employee::getSalary));
        listView.getItems().setAll(employees);
        // Logica para ordenar por salario
    }
}

