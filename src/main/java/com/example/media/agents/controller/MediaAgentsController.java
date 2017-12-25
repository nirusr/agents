package com.example.media.agents.controller;

import com.example.media.agents.dto.*;
import com.example.media.agents.service.MediaAgentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
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

    @GetMapping(value = "list2", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MediaAgentsListDTO> getMediaAgents3() {
        MediaAgentsListDTO l = new MediaAgentsListDTO();
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writer().withoutRootName().writeValueAsString(mediaAgentService.getAllMediaAgents1()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(mediaAgentService.getAllMediaAgents1(), HttpStatus.OK);


    }

    @GetMapping(value = "list3", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMediaAgents4() {

        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        try {
            System.out.println(mapper.writer().withoutRootName().writeValueAsString(mediaAgentService.getAllMediaAgents1()));
            str = mapper.writer().withoutRootName().writeValueAsString(mediaAgentService.getAllMediaAgents1());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return str;


    }

    @GetMapping(value = "list4")
    public ResponseEntity<List<MediaAgents>> getAllMediaAgents5() {
        mediaAgentService.getAllMediaAgents_By_Super();
        return new ResponseEntity(mediaAgentService.getAllMediaAgents_By_Interface(), HttpStatus.OK);

    }
    @GetMapping(value = "list5")
    public ResponseEntity<List<BMediAgents>> getAllMediaAgents6() {
        return new ResponseEntity(mediaAgentService.getAllMediaAgents_By_Super(), HttpStatus.OK);
    }

    @GetMapping(value = "list6")
    public ResponseEntity<BMediaAgentsList> getAllMediaAgents7() {
        return new ResponseEntity(mediaAgentService.getAllMediaAgents_By_List(), HttpStatus.OK);
    }

    @GetMapping(value = "list7", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllMediaAgents8() {
        ObjectMapper mapper = new ObjectMapper();
        String str = "";
        try {
            str = mapper.writer().withoutRootName().writeValueAsString(mediaAgentService.getAllMediaAgents_By_List());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;

    }

}
