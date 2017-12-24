package com.example.media.agents.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.sql.DataSourceDefinition;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Caption")
@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT,use= JsonTypeInfo.Id.NAME)
public class MediaAgentDto  {

    private String type;
    private String name;
    private String id;

    public MediaAgentDto() {
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
