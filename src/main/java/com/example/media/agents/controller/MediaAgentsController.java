package com.example.media.agents.controller;

import com.example.media.agents.dto.MediaAgentDto;
import com.example.media.agents.dto.MediaAgentsList;
import com.example.media.agents.dto.TranscriptDTO;
import com.example.media.agents.service.MediaAgentService;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/media/agents")
public class MediaAgentsController {

    @Autowired
    MediaAgentService mediaAgentService;

    @GetMapping(value = "caption")
    public ResponseEntity<MediaAgentDto> getMediaAgents() {
        return new ResponseEntity(  mediaAgentService.getMediaAgents(), HttpStatus.OK);

    }

    @GetMapping(value = "list")
    public ResponseEntity<ArrayList<MediaAgentDto>> getMediaAgents1() {
       return new ResponseEntity(mediaAgentService.getAllMediaAgents(), HttpStatus.OK);

    }
    @GetMapping(value = "list1")
    public ResponseEntity <Map<String, MediaAgentDto>> getMediaAgents2() {
        ArrayList<MediaAgentDto> list = new ArrayList<>();
        list = mediaAgentService.getAllMediaAgents();
        Map result = new HashMap();
        result.put("MediaAgents", mediaAgentService.getAllMediaAgents());

        /*
        //String rootName = MediaAgentDto.class.getAnnotation(JsonTypeName.class).value();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writer().withoutRootName().writeValueAsString(list));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        */
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping(value = "list2")
    public ResponseEntity<MediaAgentsList> getMediaAgents3() {
        MediaAgentsList list = new MediaAgentsList();
        ArrayList<MediaAgentDto> mediaAgentDtos = new ArrayList<>();
        mediaAgentDtos = mediaAgentService.getAllMediaAgents();
        list.setMediaAgentDto(mediaAgentDtos);
        return new ResponseEntity(list, HttpStatus.OK);
    }


    @GetMapping(value = "transcript")
    public ResponseEntity<ArrayList<TranscriptDTO>> getMediaAgents4() {
        return new ResponseEntity(mediaAgentService.getTransacript(), HttpStatus.OK);

    }
}
