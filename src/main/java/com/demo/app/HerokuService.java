package com.demo.app;

import com.demo.app.model.Heroku;
import java.util.List;

public interface HerokuService {
    Heroku addTricomms(Heroku entity);
    List<Heroku> getAll();
    Heroku updateTricomms(Heroku entity);
    void deleteAnyUser(Long id);
}
