package com.demo.app.repo.Heroku;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.app.model.Heroku;

public interface repo extends JpaRepository<Heroku,Long>{
}
