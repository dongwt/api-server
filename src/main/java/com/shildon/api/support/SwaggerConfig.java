package com.shildon.api.support;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author shildon<shildondu@gmail.com>
 * @date Jul 10, 2016
 */
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.useDefaultResponseMessages(false);
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Api Documents")
				.contact(new Contact("Shildon", "", "shildondu@gmail.com"))
				.build();
	}

}
