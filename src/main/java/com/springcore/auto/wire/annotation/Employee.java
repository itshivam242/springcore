package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Employee {
    private int empId;
    private String empName;
    private Address address;
    private List<Integer> number;
    @Override
    public String toString() {
        return "Id:" + empId +
                ", Name:" + empName +
                ", Address:" + address+
                ", Numbers:" + number;
    }
    public Employee()
    {
        super();
        System.out.println( "Inside Employee no parameter constructor" );
    }
    @Autowired
    public Employee(Address address) {
        this.address = address;
        System.out.println( "Inside Employee address parameter constructor" );
    }

    public Employee(int empId, String empName, Address address, List<Integer> number) {
        System.out.println( "Inside Employee parameterized constructor" );
        this.empId = empId;
        this.empName = empName;
        this.address=address;
        this.number=number;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(List<Integer> number) {
        this.number = number;
    }
}
