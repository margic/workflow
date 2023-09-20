package com.margic.kogito.workflow.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class GenerateProtestsInput implements Serializable{
    private int numberToGenerate;
}
