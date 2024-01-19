package com.margic.kogito.workflow.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Configuration {

    private String source;
    private String destination;
    
}
