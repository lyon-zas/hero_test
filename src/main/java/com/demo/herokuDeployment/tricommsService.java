package com.demo.herokuDeployment;

import com.demo.herokuDeployment.model.Tricomms;
import java.util.List;

public interface tricommsService {
    Tricomms addTricomms(Tricomms entity);
    List<Tricomms> getAll();
    Tricomms updateTricomms(Tricomms entity);
    void deleteAnyUser(Long id);
}
