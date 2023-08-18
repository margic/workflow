package com.margic.kogito.workflow.model;

import java.util.Date;

import lombok.Data;

@Data
public class Protest {
  private String trackingId;
  private String requestorName;
  private String requestorId;
  private Date dateReceived;
}
