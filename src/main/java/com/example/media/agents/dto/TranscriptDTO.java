package com.example.media.agents.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class TranscriptDTO {
    @JsonIgnore
    private static String type;

    private static String name;
    private static String id;



    public static String getType() {
        return type;
    }

    public static String getName() {
        return name;
    }

    public static String getId() {
        return id;
    }

    public static void setType(String type) {
        TranscriptDTO.type = type;
    }

    public static void setName(String name) {
        TranscriptDTO.name = name;
    }

    public static void setId(String id) {
        TranscriptDTO.id = id;
    }

    @JsonAnyGetter
    public Map<String, Object> any() {

        return Collections.singletonMap(name.getClass().getName(), name );

    }
}

