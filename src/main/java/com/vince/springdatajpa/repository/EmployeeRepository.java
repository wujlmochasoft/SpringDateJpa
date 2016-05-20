package com.vince.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.vince.springdatajpa.entity.Employee;

/**
 * create by wujl on 2016年5月20日
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
}
