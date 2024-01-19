package com.margic.kogito.workflow.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Session is object that is used to provide configuration tracing and control
 */


@Data
@Builder
@Jacksonized
public class Session {

    private String Id;
    private String type;
    private Configuration config;


}