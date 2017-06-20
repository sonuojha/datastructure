package com.Collection;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by aojha on 6/19/17.
 */

class Employee{
    int id;
    String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
};

public class SetInterface {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "aka");
        Employee employee2 = new Employee(2, "aka");
        Employee employee4 = new Employee(1, "aka");
        Employee employee3 = new Employee(1, "Patra");
        //Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        Set<Employee> s = new HashSet<Employee>();

        s.add(employee1);
        s.add(employee2);
        s.add(employee3);
        s.add(employee4);

        System.out.println(s);

        ExecutorService executorService = Executors.newCachedThreadPool();


    }
}
