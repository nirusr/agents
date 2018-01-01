package com.example.media.agents.model;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Date;

@PrimaryKeyClass
public class MediaAgentsKey implements Serializable {

    @PrimaryKeyColumn(name = "call_id", type = PrimaryKeyType.PARTITIONED)
    private String callId;
    @PrimaryKeyColumn(name = "created_at")
    private Date createdAt;

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
