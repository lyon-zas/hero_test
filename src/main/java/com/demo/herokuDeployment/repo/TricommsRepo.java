package com.demo.herokuDeployment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.herokuDeployment.model.Tricomms;

public interface TricommsRepo extends JpaRepository<Tricomms,Long> {

}
