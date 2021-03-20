package io.javabrain.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name = "Eid")
    private int eid;
    @Column(name = "Name")
    private String name;
    @Column(name = "location")
    private String location;

    public Employee(){

    }

    public Employee(int eid, String name, String location) {
        this.eid = eid;
        this.name = name;
        this.location = location;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}