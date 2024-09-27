package com_spring_boot_pro1.pro1.repository;

import com_spring_boot_pro1.pro1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {










}
