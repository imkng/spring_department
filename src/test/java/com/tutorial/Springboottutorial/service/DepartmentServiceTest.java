package com.tutorial.Springboottutorial.service;

import com.tutorial.Springboottutorial.entity.Department;
import com.tutorial.Springboottutorial.error.DepartmentNotFoundException;
import com.tutorial.Springboottutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder().departmentName("ITT")
                        .departmentAddress("Bangalore")
                        .departmentId(1L)
                        .departmentCode("IT-06")
                        .build();

        Mockito.when(departmentRepository.findByDepartmentName("ITT")).thenReturn(department);

//        Mockito.when(departmentRepository.findById(1L).get()).thenReturn(department);
    }

    @BeforeEach
    void setUp1() {
        Department department =
                Department.builder().departmentName("ITT")
                        .departmentAddress("Bangalore")
                        .departmentId(1L)
                        .departmentCode("IT-06")
                        .build();

//        Mockito.when(departmentRepository.findByDepartmentName("ITT")).thenReturn(department);

        Mockito.when(departmentRepository.findById(1L).get()).thenReturn(department);
    }
   @Test
   @DisplayName("Get Department based om department name")
    public void testGetDepartmentByName(){
        String departmentName = "ITT";
        Department found = departmentService.getDepartmentByName("ITT");

        assertEquals(departmentName, found.getDepartmentName());
    }



}