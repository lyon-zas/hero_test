package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.app.model.Heroku;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")


public class HerokuController {
    @Autowired
    private HerokuService service;

    @PostMapping("/new")
    public Heroku addNewTricomms(@RequestBody Heroku entity){
        return service.addTricomms(entity);
    }

    @GetMapping("/getAllTricomms")
    public List<Heroku> fetchAll(){
        return service.getAll();
    }

    @PutMapping("/updateTricomms")
    public Heroku updateExistingTricomms(@RequestBody Heroku entity){
        return  service.updateTricomms(entity);
    }

    @DeleteMapping("/deleteAnyUser/{id}")
    public Heroku deleteTricomms(@PathVariable("id") Long id){
        service.deleteAnyUser(id);
        return null;
    }


}
