package com.margic.kogito.workflow.tasks;

import java.util.UUID;

import com.margic.kogito.workflow.model.Protest;

public class ProtestService {
  public void generateTrackingId(Protest protest){
    UUID uuid = UUID.randomUUID();
    protest.setTrackingId(uuid.toString());
  }
  
}
