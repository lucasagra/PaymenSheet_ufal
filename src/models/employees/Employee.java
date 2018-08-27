package models.employees;


import models.employees.info.Address;
import models.employees.info.Syndicate;
import models.employees.info.WorkedTime;

import java.io.Serializable;


public class Employee implements Serializable {
    private int id;
    private String name;
    private Address address;
    private Syndicate syndicate;
    private WorkedTime worked_hours;

    public Employee(int id, String name, Address address, Syndicate syndicate, WorkedTime worked_hours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.syndicate = syndicate;
        this.worked_hours = worked_hours;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public Syndicate getSyndicate() {
        return syndicate;
    }

    public WorkedTime getWorked_hours() {
        return worked_hours;
    }
}
