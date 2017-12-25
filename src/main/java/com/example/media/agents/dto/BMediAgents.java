package com.example.media.agents.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT,use= JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BTransacriptDTO.class, name = "transcript"),
        @JsonSubTypes.Type(value = BSlideExtractionDTO.class, name = "slideExtract"),
        @JsonSubTypes.Type(value = BCaptionDTO.class, name = "caption")
})
public interface BMediAgents {
}
