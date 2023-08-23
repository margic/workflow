package com.margic.kogito.workflow.tasks;

import java.util.UUID;

import com.margic.kogito.workflow.model.Protest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProtestService {
  public Protest newProtest(){
    UUID uuid = UUID.randomUUID();
    Protest protest = Protest.builder().trackingId(uuid.toString()).build();
    log.info("new protest created {}", protest);

    return protest;
  }
  
}
