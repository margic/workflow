package com.margic.kogito.workflow.tasks;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.margic.kogito.workflow.model.GenerateProtestsInput;
import com.margic.kogito.workflow.model.Protest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenerateProtests {

  public Protest newProtest(GenerateProtestsInput input){
    UUID uuid = UUID.randomUUID();
    Protest protest = Protest.builder().trackingId(uuid.toString()).build();
    log.info("new protest created {}, {}", protest, input);

    return protest;
  }
  
}
