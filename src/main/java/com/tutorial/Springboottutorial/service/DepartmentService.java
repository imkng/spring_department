package com.tutorial.Springboottutorial.service;

import com.tutorial.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartment();


    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}
