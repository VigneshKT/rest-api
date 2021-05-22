package io.javabrain.restapi;

import io.javabrain.restapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Employee,Integer> {
}
