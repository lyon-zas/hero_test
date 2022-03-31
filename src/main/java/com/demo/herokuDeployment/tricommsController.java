package com.demo.herokuDeployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.herokuDeployment.model.Tricomms;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class tricommsController {
    @Autowired
    private tricommsService service;

    @PostMapping("/new")
    public Tricomms addNewTricomms(@RequestBody Tricomms entity){
        return  service.addTricomms(entity);
    }

    @GetMapping("/getAllTricomms")
    public  List<Tricomms> fetchAll(){
        return service.getAll();
    }

    @PutMapping("/updateTricomms")
    public Tricomms updateExistingTricomms(@RequestBody Tricomms entity){
        return service.updateTricomms(entity);
    }

    @DeleteMapping("/deleteAnyUser/{id}")
    public Tricomms deleteTricomms(@PathVariable("id") Long id){
        service.deleteAnyUser(id);
        return null;
    }
}
