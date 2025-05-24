package com.example.springdatajpacrudeample.controller;

import com.example.springdatajpacrudeample.entity.SampleEntity;
import com.example.springdatajpacrudeample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/users")
@RestController
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/getAllUsers")
    public List<SampleEntity> getUsers() {
       return sampleService.getAll();
    }

    @GetMapping("/{id}")
    public SampleEntity getUserById(@PathVariable long id) {
        return sampleService.findById(id);
    }

    @PostMapping("/createUser")
    public SampleEntity saveUser(@RequestBody SampleEntity user) {
        return sampleService.save(user);
    }

    @PutMapping("/updateUser")
    public SampleEntity updateUser(SampleEntity user) {
        return sampleService.save(user);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@PathVariable long id) {
         sampleService.deleteById(id);
    }

}
