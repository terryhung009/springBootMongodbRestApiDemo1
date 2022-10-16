package com.danny.springBootMongoDBRestApi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class Config extends AbstractMongoClientConfiguration {
    @Value("spring.data.mongodb.database")
    private String databaseName;

    @Override
    protected String getDatabaseName() {
        return null;
    }

    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
    @Bean
    MongoTransactionManager transactionManager(MongoDatabaseFactory factory){
        return new MongoTransactionManager(factory);
    }
}
