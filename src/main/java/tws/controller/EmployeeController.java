package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeMapper.getAllEmployees();
                return ResponseEntity.ok(employees);
    }

//    @PostMapping
//    public ResponseEntity<Employee> addEmployees(@RequestBody  Employee employee){
//
//    }
}
