package com.lee.Service;

import com.lee.DAO.EmployeeDAO;
import com.lee.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: zhour
 * Date: 26/03/2014
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public void persistEmployee(Employee employee) {
        employeeDAO.persistEmployee(employee);

    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);

    }
    @Override
    @Transactional
    public Employee findEmployeeById(String id) {
        return employeeDAO.findEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);

    }

}
