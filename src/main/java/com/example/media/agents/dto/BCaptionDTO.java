package com.example.media.agents.dto;

public class BCaptionDTO extends BaseMediaAgents{
    private String phrase;

    public BCaptionDTO() {
    }

    public BCaptionDTO(String name, String id, String type, String phrase) {
        super(name, id, type);
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
