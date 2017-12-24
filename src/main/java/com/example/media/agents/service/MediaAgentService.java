package com.example.media.agents.service;

import com.example.media.agents.dto.MediaAgentDto;
import com.example.media.agents.dto.MediaAgentsList;
import com.example.media.agents.dto.TranscriptDTO;
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

    public ArrayList<MediaAgentDto> getAllMediaAgents() {

        ArrayList<MediaAgentDto> mediaAgents = new ArrayList<>();
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

    public MediaAgentsList getAllMediaAgents1() {
        MediaAgentsList list = new MediaAgentsList();
        ArrayList<MediaAgentDto> mediaAgents = new ArrayList<>();
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

        list.setMediaAgentDto(mediaAgents);
        return list;


    }

    public ArrayList<TranscriptDTO> getTransacript() {

        ArrayList<TranscriptDTO> transcriptDTOS = new ArrayList<>();
        TranscriptDTO transcriptDTO  ;

        transcriptDTO =  new TranscriptDTO();
        transcriptDTO.setId("1234");
        transcriptDTO.setName("1My Caption");
        transcriptDTO.setType("Transcript");
        transcriptDTOS.add(transcriptDTO);

        transcriptDTO =  new TranscriptDTO();
        transcriptDTO.setId("2234");
        transcriptDTO.setName("1My Caption");
        transcriptDTO.setType("Transcript");
        transcriptDTOS.add(transcriptDTO);


        transcriptDTO =  new TranscriptDTO();
        transcriptDTO.setId("3234");
        transcriptDTO.setName("1My Caption");
        transcriptDTO.setType("Transcript");
        transcriptDTOS.add(transcriptDTO);



        return transcriptDTOS;

    }

}


