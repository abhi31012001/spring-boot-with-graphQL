package com.springforgraphql.devproblems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;

@SpringBootApplication
@Configuration
public class SpringForGraphqlR2dbcApplication   {

    public static void main(String[] args) {
        SpringApplication.run(SpringForGraphqlR2dbcApplication .class, args);
    }

	@Bean
	public HttpGraphQlClient httpGraphQlClient() {
		return HttpGraphQlClient.builder().url("http://localhost:8080/graphql").build();
	}
}