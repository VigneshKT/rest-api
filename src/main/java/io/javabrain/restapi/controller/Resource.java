package io.javabrain.restapi.controller;

import io.javabrain.restapi.Repository.Repository;
import io.javabrain.restapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class Resource {

    @Autowired
    Repository repo;

    @GetMapping(path = "/employee",produces = {"application/json"})
    public List<Employee> getAll(){

        return repo.findAll();
    }

    @GetMapping(path = "/employee/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable int id){
         return repo.findById(id);
    }

    @PostMapping(path = "/employee")
    public Employee addEmployee(@RequestBody Employee employee){

        repo.save(employee);
        return employee;
    }

    @PutMapping(path = "/employee/{id}")
    public Employee updateOrAdd(@RequestBody Employee newemployee){

        return repo.save(newemployee);
    }

    @DeleteMapping(path = "/employee/{id}")
    public String deleteEmployee(@PathVariable("id") int id){
        repo.deleteById(id);
        return "deleted";
    }

}
