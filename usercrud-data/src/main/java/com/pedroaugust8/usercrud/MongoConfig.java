package com.pedroaugust8.usercrud;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * @author Pedro Barros
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "users";
    }

    @Override
    public Mongo mongo() {
        return new Fongo("mongo-test").getMongo();
    }
}