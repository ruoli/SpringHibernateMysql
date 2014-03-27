package com.lee.Service;

import com.lee.Model.Employee;

/**
 * Created with IntelliJ IDEA.
 * User: zhour
 * Date: 26/03/2014
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeService {
    void persistEmployee(Employee employee);

    Employee findEmployeeById(String id);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
