package com.example.media.agents.controller;

import com.example.media.agents.dto.MediaAgentDto;
import com.example.media.agents.dto.MediaAgentsList;
import com.example.media.agents.service.MediaAgentService;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/media/agents")
public class MediaAgentsController {

    @Autowired
    MediaAgentService mediaAgentService;

    @GetMapping
    public ResponseEntity<MediaAgentDto> getMediaAgents() {
        return new ResponseEntity(  mediaAgentService.getMediaAgents(), HttpStatus.OK);

    }

    @GetMapping(value = "list")
    public ResponseEntity<List<MediaAgentDto>> getMediaAgents1() {
        return new ResponseEntity(mediaAgentService.getAllMediaAgents(), HttpStatus.OK);

    }

    @GetMapping(value = "list1", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MediaAgentDto>> getMediaAgents2() {
        ObjectMapper mapper = new ObjectMapper();

        ArrayList<MediaAgentDto> list = new ArrayList<>();
        try {
            System.out.println(mapper.writer().writeValueAsString(mediaAgentService.getAllMediaAgents()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        list.add(mediaAgentService.getMediaAgents());
        return new ResponseEntity(list, HttpStatus.OK);

    }

    @GetMapping(value = "list2")
    public MediaAgentsList getMediaAgents3() {
        MediaAgentsList l = new MediaAgentsList();
        return mediaAgentService.getAllMediaAgents1();


    }


}
