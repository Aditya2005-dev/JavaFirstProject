package com.example.Learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addemployee")
@CrossOrigin("*")

public class API {
    @Autowired
    Employee emp;

    @PostMapping("/name")
    public String entername(@RequestBody Employee emp){

        return emp.getFirstName() + " " + emp.getLastName();

    }
    @PostMapping("/calculate")
    public int calculatesalary(@RequestBody int salary){
        emp.setSalary(salary);
        return emp.yearlysalary();
    }

}
