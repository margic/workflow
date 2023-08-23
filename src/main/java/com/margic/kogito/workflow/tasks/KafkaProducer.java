package com.margic.kogito.workflow.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.margic.kogito.workflow.model.Protest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {
  @Autowired KafkaTemplate<String, Protest> kafkaTemplate;

  public void sendKafkaMessage(Protest protest){
    log.info("sending protest to protests topic: {}", protest);
    kafkaTemplate.send("Protests", protest.getTrackingId(), protest);
  }
}
