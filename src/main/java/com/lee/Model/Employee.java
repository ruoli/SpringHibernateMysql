package com.lee.Model;

import com.sun.tools.javac.jvm.Items;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhour
 * Date: 26/03/2014
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE", nullable = false)
    private long age;


    private List<Projects> projects;


    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @OneToMany(targetEntity=Projects.class, mappedBy="EMPLOYEE", fetch=FetchType.EAGER)
    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }
}