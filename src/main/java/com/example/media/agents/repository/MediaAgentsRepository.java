package com.example.media.agents.repository;

import com.example.media.agents.model.MediaAgents;
import com.example.media.agents.model.MediaAgentsKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaAgentsRepository extends CassandraRepository<MediaAgents> {


}
