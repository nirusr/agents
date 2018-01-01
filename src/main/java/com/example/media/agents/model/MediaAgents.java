package com.example.media.agents.model;


import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import java.util.Date;

@Table("find_media_agent_by_call_id")
public class MediaAgents {
    @PrimaryKeyColumn(name = "call_id")
    public String callId;
    @Column(value = "media_agent_id")
    public String mediaAgentId;
    @Column(value = "user_id")
    public String userId;
    @Column(value = "media_agent_type")
    public String mediaAgentType;
    @PrimaryKeyColumn(name = "created_at",type = PrimaryKeyType.PARTITIONED)
    public Date createdAt;

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getMediaAgentId() {
        return mediaAgentId;
    }

    public void setMediaAgentId(String mediaAgentId) {
        this.mediaAgentId = mediaAgentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMediaAgentType() {
        return mediaAgentType;
    }

    public void setMediaAgentType(String mediaAgentType) {
        this.mediaAgentType = mediaAgentType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
