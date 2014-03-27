package com.lee.AppMain;

import com.lee.Model.Employee;
import com.lee.Model.Projects;
import com.lee.Service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("load context");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        Projects johnsproject= new Projects();
        johnsproject.setProjectTitle("APP project");
        johnsproject.setProjectType("IOS");

        List<Projects> projectList = new ArrayList<Projects>();
        projectList.add(johnsproject);


        Employee em = new Employee();
        em.setId("11");
        em.setName("eee");
        em.setAge(22);
        em.setProjects(projectList);

        EmployeeService emService = (EmployeeService) context.getBean("employeeService");

        emService.persistEmployee(em);
        System.out.println("Updated age :" + emService.findEmployeeById("11").getAge());

//        em.setAge(53);
//        emService.updateEmployee(em);
//        System.out.println("Updated age :" + emService.findEmployeeById("88").getAge());

        emService.deleteEmployee(em);

        context.close();
    }
}
