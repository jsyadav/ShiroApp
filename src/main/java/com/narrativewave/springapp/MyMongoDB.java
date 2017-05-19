package com.narrativewave.springapp;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;

@Configuration
class MyMongoDB  extends AbstractMongoConfiguration{
	final static String DATABASENAME = "shiro";
	/*
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient("localhost" , 27017 ), DATABASENAME);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());				
		return mongoTemplate;		
	}
	*/

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return DATABASENAME;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new Mongo();
	}
	
	  @Override
	  protected String getMappingBasePackage() {
	    return "com.narrativewave.springapp";
	  }
	  
}
