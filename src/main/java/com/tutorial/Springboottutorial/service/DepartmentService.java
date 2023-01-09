package com.tutorial.Springboottutorial.service;

import com.tutorial.Springboottutorial.entity.Department;
import com.tutorial.Springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartment();


    Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
