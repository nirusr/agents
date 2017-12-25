package com.example.media.agents.dto;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT,use= JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TranscriptDTO.class, name = "transcript"),
        @JsonSubTypes.Type(value = SlideExtractionDTO.class, name = "slideExtract")
})
public interface MediaAgents {
}
