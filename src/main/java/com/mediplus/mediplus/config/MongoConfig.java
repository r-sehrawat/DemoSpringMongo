package com.mediplus.mediplus.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories("com.mediplus.mediplus.repositories")
public class MongoConfig {

	@Value("${db.connectionURL:localhost}")

	private String databaseURL;

	@Value("${db.name:mediplus}")

	private String databaseName;

	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {

		List<ServerAddress> servers = new ArrayList<>();

		for (String serverUrl : databaseURL.split(",")) {
			servers.add(new ServerAddress(serverUrl));
		}

		return new SimpleMongoDbFactory(new MongoClient(servers), databaseName);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
	}
	
	@Bean
	public Gson gson() {
		return new Gson();
		
	}
}
