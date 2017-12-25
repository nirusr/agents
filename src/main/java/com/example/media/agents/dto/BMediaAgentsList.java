package com.example.media.agents.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("MediaAgents")

public class BMediaAgentsList extends ArrayList<BMediAgents> {
    private List<BMediaAgentsList> bMediaAgentsLists = new ArrayList<>();

    public List<BMediaAgentsList> getbMediaAgentsLists() {
        return bMediaAgentsLists;
    }

    public void setbMediaAgentsLists(List<BMediaAgentsList> bMediaAgentsLists) {
        this.bMediaAgentsLists = bMediaAgentsLists;
    }
}
