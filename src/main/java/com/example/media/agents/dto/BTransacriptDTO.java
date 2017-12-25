package com.example.media.agents.dto;

public class BTransacriptDTO  extends  BaseMediaAgents{
    private String transcriptSubType;

    public BTransacriptDTO() {
    }

    public BTransacriptDTO(String name, String id, String type, String transcriptSubType) {
        super(name, id, type);
        this.transcriptSubType = transcriptSubType;
    }

    public String getTranscriptSubType() {
        return transcriptSubType;
    }

    public void setTranscriptSubType(String transcriptSubType) {
        this.transcriptSubType = transcriptSubType;
    }
}
