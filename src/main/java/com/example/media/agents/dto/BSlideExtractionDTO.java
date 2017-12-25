package com.example.media.agents.dto;

public class BSlideExtractionDTO extends BaseMediaAgents {

    private String slideLength;

    public BSlideExtractionDTO() {
    }

    public BSlideExtractionDTO(String name, String id, String type, String slideLength) {
        super(name, id, type);
        this.slideLength = slideLength;
    }

    public String getSlideLength() {
        return slideLength;
    }

    public void setSlideLength(String slideLength) {
        this.slideLength = slideLength;
    }
}
