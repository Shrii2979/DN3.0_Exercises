package com.example.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.projection.EmployeeProjection;
import com.example.employeemanagement.entity.Employee;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByName(String name);
	
    List<Employee> findByDepartmentId(Long departmentId);
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findByEmail(@Param("email") String email);

    @Query("SELECT e.name as name, e.email as email FROM Employee e")
    List<EmployeeProjection> findAllProjected();
}
