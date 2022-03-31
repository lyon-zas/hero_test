package com.demo.herokuDeployment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.herokuDeployment.tricommsService;
import com.demo.herokuDeployment.model.Tricomms;
import com.demo.herokuDeployment.repo.TricommsRepo;
import java.util.List;

@Service
public class tricommsServiceImpl implements tricommsService {

    @Autowired
    private TricommsRepo repo;

    @Override
    public Tricomms addTricomms(Tricomms entity){
        return repo.save(entity);
    }

    @Override
    public List<Tricomms> getAll(){
        return repo.findAll();
    }

    @Override
    public Tricomms updateTricomms(Tricomms entity){
        return repo.save(entity);
    }

    @Override
    public void deleteAnyUser(Long id){
        repo.deleteById(id);
    }
}
