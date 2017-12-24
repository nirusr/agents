package com.example.media.agents.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.media.agents.dto.MediaAgentDto;
import com.example.media.agents.dto.MediaAgentsList;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Media;
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

        MediaAgentDto mediaAgentDto1  ;
        mediaAgentDto1 =  new MediaAgentDto();
        mediaAgentDto1.setId("2234");
        mediaAgentDto1.setName("1My Caption");
        mediaAgentDto1.setType("Caption");
        mediaAgents.add(mediaAgentDto);


        MediaAgentDto mediaAgentDto2;
        mediaAgentDto2 =  new MediaAgentDto();
        mediaAgentDto2.setId("3234");
        mediaAgentDto2.setName("1My Caption");
        mediaAgentDto2.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        return mediaAgents;

    }


    public MediaAgentsList getAllMediaAgents1() {
        MediaAgentsList result = new MediaAgentsList();

        List<MediaAgentDto> mediaAgents = new ArrayList<>();
        MediaAgentDto mediaAgentDto  ;

        mediaAgentDto =  new MediaAgentDto();
        mediaAgentDto.setId("1234");
        mediaAgentDto.setName("1My Caption");
        mediaAgentDto.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        MediaAgentDto mediaAgentDto1  ;
        mediaAgentDto1 =  new MediaAgentDto();
        mediaAgentDto1.setId("2234");
        mediaAgentDto1.setName("1My Caption");
        mediaAgentDto1.setType("Caption");
        mediaAgents.add(mediaAgentDto);


        MediaAgentDto mediaAgentDto2;
        mediaAgentDto2 =  new MediaAgentDto();
        mediaAgentDto2.setId("3234");
        mediaAgentDto2.setName("1My Caption");
        mediaAgentDto2.setType("Caption");
        mediaAgents.add(mediaAgentDto);

        //result.setMediaAgentDtos(mediaAgents);
        result.addAll(mediaAgents);
        System.out.println(result.getMediaAgentDtos());
        return result;


    }
}

