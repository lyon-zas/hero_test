package com.demo.herokuDeployment.services;

import com.demo.herokuDeployment.entities.MyEntity;
import com.demo.herokuDeployment.repositories.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("myService")
@Transactional
public class MyService {

    @Autowired
    MyEntityRepository repository;

    public MyEntity addNewEntity(MyEntity entity) {
        return repository.save(entity);
    }

    // public void deleteEntity (MyEntity entity) throws Exception {
    //     MyEntity myEntity = repository.findById(entity.getId()).orElseThrow(() -> new Exception("no such company"));
    // }

    public List<MyEntity> getAll() {
        return repository.findAll();
    }
}
