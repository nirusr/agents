package com.example.media.agents.controller;

import com.example.media.agents.dto.MediaAgentDto;
import com.example.media.agents.service.MediaAgentService;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
