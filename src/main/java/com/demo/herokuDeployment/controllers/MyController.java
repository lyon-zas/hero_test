package com.demo.herokuDeployment.controllers;

import com.demo.herokuDeployment.entities.MyEntity;
import com.demo.herokuDeployment.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    MyService service;

    @PostMapping
    public void addEntity(@RequestBody MyEntity myEntity) {
        System.out.println(myEntity);
        service.addNewEntity(myEntity);
    }

    @DeleteMapping
    public void deleteEntity(MyEntity myEntity) {
        try {
            service.deleteEntity(myEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public ArrayList<MyEntity> getAll() {
        return new ArrayList<MyEntity>(service.getAll());
    }

}
