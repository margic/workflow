package com.margic.kogito.workflow.tasks;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HelloService {
  public void hello(){
    log.info("hello world");
  }
}
