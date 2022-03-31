package com.demo.herokuDeployment.repositories;

import com.demo.herokuDeployment.entities.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MyEntityRepository")
public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
