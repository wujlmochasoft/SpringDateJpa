package com.vince.springdatajpa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vince.springdatajpa.entity.Employee;
import com.vince.springdatajpa.repository.EmployeeRepository;

/**
 * create by wujl on 2016年5月20日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class SpringDataJpaTest {

	@Autowired
	private EmployeeRepository employeeRepository ;
	
	@Test
	public void test() {
		Employee entity = new Employee();
		entity.setFirstName("wu");
		entity.setLastName("jl");
		entity.setDept("dev");
		employeeRepository.save(entity);
	}

}
