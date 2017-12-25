package com.example.media.agents.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;
@JsonRootName("MediaList")
public  class MediaAgentsListDTO extends ArrayList<MediaAgentDto> {
    private  List<MediaAgentDto> mediaAgentDtos = new ArrayList<>();

    public List<MediaAgentDto> getMediaAgentDtos() {
        return mediaAgentDtos;
    }

    public void setMediaAgentDtos(List<MediaAgentDto> mediaAgentDtos) {
        this.mediaAgentDtos = mediaAgentDtos;
    }
}

