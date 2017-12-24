package com.example.media.agents.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public  class MediaAgentsList {
    @JsonProperty("MList")
    private  List<MediaAgentDto> mediaAgentDto = new ArrayList<>();
    public void setMediaAgentDto(List<MediaAgentDto> mediaAgentDto) {
        this.mediaAgentDto = mediaAgentDto;
    }
}

