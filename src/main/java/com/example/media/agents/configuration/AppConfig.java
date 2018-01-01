package com.example.media.agents.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.cassandra.config.CassandraCqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class AppConfig extends AbstractCassandraConfiguration {

    @Value("${cassandra.contactpoints}")
    private String contactPoints;
    @Value("${cassandra.port}")
    private int port;
    @Value("${cassandra.keyspace}")
    private String keySpace;
    @Value("${cassandra.basepackages}")
    private String basePackages;

    @Override
    protected String getContactPoints() {
        return contactPoints;

    }

    @Override
    protected String getKeyspaceName() {
        return keySpace;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[] {
                basePackages
        };
    }
}
