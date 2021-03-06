package com.example.media.agents.service;

import com.example.media.agents.dto.*;
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


    public MediaAgentsListDTO getAllMediaAgents1() {
        MediaAgentsListDTO result = new MediaAgentsListDTO();

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

    public List<MediaAgents> getAllMediaAgents_By_Interface() {

        List<MediaAgents> list = new ArrayList<>();
        TranscriptDTO transcriptDTO;
        SlideExtractionDTO slideExtractionDTO;

        //1
        transcriptDTO = new TranscriptDTO();
        transcriptDTO.setName("My Transcript1");
        transcriptDTO.setId("123");
        transcriptDTO.setType("TRANSCRIPT Type");
        list.add(transcriptDTO);

        transcriptDTO = new TranscriptDTO();
        transcriptDTO.setName("My Transcript2");
        transcriptDTO.setId("223");
        transcriptDTO.setType("TRANSCRIPT Type");
        list.add(transcriptDTO);

        slideExtractionDTO = new SlideExtractionDTO();
        slideExtractionDTO.setName("My Slide Extraction1");
        slideExtractionDTO.setId("1234");
        slideExtractionDTO.setType("TRANSCRIPT");
        list.add(slideExtractionDTO);

        slideExtractionDTO = new SlideExtractionDTO();
        slideExtractionDTO.setName("My Slide Extraction2");
        slideExtractionDTO.setId("2234");
        slideExtractionDTO.setType("TRANSCRIPT");
        list.add(slideExtractionDTO);
        System.out.println(list.size());
        return list;

    }

    public List<BMediAgents> getAllMediaAgents_By_Super() {

        BCaptionDTO  bCaptionDTO;
        BTransacriptDTO bTransacriptDTO;
        BSlideExtractionDTO bSlideExtractionDTO;
        List<BMediAgents> bMediAgents = new ArrayList<>();


        bCaptionDTO = new BCaptionDTO();
        bCaptionDTO.setName("Captioning my speach-1-B");
        bCaptionDTO.setId("C112345-B");
        bCaptionDTO.setType("Caption-B");
        bCaptionDTO.setPhrase("Hello how are you-S");
        bMediAgents.add(bCaptionDTO);


        bTransacriptDTO = new BTransacriptDTO();
        bTransacriptDTO.setName("My Transcript-1-B");
        bTransacriptDTO.setId("T1ABCD-B");
        bTransacriptDTO.setType("Transcript-B");
        bTransacriptDTO.setTranscriptSubType("Powerpoint slides-S");
        bMediAgents.add(bTransacriptDTO);

        bSlideExtractionDTO = new BSlideExtractionDTO();
        bSlideExtractionDTO.setName("My Slide Extractions of Speach1-B");
        bSlideExtractionDTO.setId("S1ABCD-B");
        bSlideExtractionDTO.setName("SlideExtraction-B");
        bSlideExtractionDTO.setSlideLength("30 Min-S");
        bMediAgents.add(bSlideExtractionDTO);
        System.out.println(bCaptionDTO.getPhrase());

        return bMediAgents;
    }

    public BMediaAgentsList getAllMediaAgents_By_List() {

        BCaptionDTO  bCaptionDTO;
        BTransacriptDTO bTransacriptDTO;
        BSlideExtractionDTO bSlideExtractionDTO;
        List<BMediAgents> bMediAgents = new ArrayList<>();


        bCaptionDTO = new BCaptionDTO();
        bCaptionDTO.setName("Captioning my speach-1-B");
        bCaptionDTO.setId("C112345-B");
        bCaptionDTO.setType("Caption-B");
        bCaptionDTO.setPhrase("Hello how are you-S");
        bMediAgents.add(bCaptionDTO);


        bTransacriptDTO = new BTransacriptDTO();
        bTransacriptDTO.setName("My Transcript-1-B");
        bTransacriptDTO.setId("T1ABCD-B");
        bTransacriptDTO.setType("Transcript-B");
        bTransacriptDTO.setTranscriptSubType("Powerpoint slides-S");
        bMediAgents.add(bTransacriptDTO);

        bSlideExtractionDTO = new BSlideExtractionDTO();
        bSlideExtractionDTO.setName("My Slide Extractions of Speach1-B");
        bSlideExtractionDTO.setId("S1ABCD-B");
        bSlideExtractionDTO.setName("SlideExtraction-B");
        bSlideExtractionDTO.setSlideLength("30 Min-S");
        bMediAgents.add(bSlideExtractionDTO);
        System.out.println(bCaptionDTO.getPhrase());

        BMediaAgentsList bMediaAgentsList = new BMediaAgentsList();
        bMediaAgentsList.addAll(bMediAgents);
        return bMediaAgentsList;



    }
}

