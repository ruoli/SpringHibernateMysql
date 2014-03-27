package com.lee.Model;

import javax.persistence.*;

/**
* Created with IntelliJ IDEA.
* User: zhour
* Date: 26/03/2014
* Time: 15:53
* To change this template use File | Settings | File Templates.
*/
@Entity
@Table(name = "PROJECTS")
public class Projects {
    private Employee employee;

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "PROJECT_TITLE", nullable = false)
    private String projectTitle;

    @Column(name = "PROJECT_TYPE", nullable = false)
    private String projectType;

    public Projects(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "ID")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
}
