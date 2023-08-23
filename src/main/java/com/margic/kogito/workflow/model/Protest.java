package com.margic.kogito.workflow.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;


@Data
@Builder
@Jacksonized
public class Protest {
  private String trackingId;
  private String requestorName;
  private String requestorId;
  private Date dateReceived;
}
