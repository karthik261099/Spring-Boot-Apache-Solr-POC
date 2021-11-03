package com.example.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@ComponentScan({"com.example.solr.controller"})
@EntityScan("com.example.solr.model")
@EnableSolrRepositories("com.example.solr.repository")
public class SpringBootApacheSolrPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheSolrPocApplication.class, args);
	}

}
