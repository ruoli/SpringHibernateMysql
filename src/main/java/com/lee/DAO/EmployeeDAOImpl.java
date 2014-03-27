package com.lee.DAO;

import com.lee.Model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: zhour
 * Date: 26/03/2014
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void persistEmployee(Employee employee) {
        sessionFactory.getCurrentSession().persist(employee);
    }

    @Override
    public Employee findEmployeeById(String id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);

    }
    @Override
    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);

    }

}