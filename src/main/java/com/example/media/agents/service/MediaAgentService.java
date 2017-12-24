package com.example.media.agents.service;

import com.example.media.agents.dto.MediaAgentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MediaAgentService {

    public MediaAgentDto getMediaAgents() {

        MediaAgentDto mediaAgentDto  = new MediaAgentDto();
        mediaAgentDto.setId("123");
        mediaAgentDto.setName("My Caption");
        mediaAgentDto.setType("Caption");
        return mediaAgentDto;


    }

    public List<MediaAgentDto> getAllMediaAgents() {

        List<MediaAgentDto> mediaAgents = new ArrayList<>();
        MediaAgentDto mediaAgentDto  ;

        mediaAgentDto =  new MediaAgentDto();
        mediaAgentDto.setId("1234");
        mediaAgentDto.setName("1My Caption");
        mediaAgentDto.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        mediaAgentDto =  new MediaAgentDto();
        mediaAgentDto.setId("2234");
        mediaAgentDto.setName("1My Caption");
        mediaAgentDto.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        mediaAgentDto =  new MediaAgentDto();
        mediaAgentDto.setId("3234");
        mediaAgentDto.setName("1My Caption");
        mediaAgentDto.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        return mediaAgents;

    }
}

