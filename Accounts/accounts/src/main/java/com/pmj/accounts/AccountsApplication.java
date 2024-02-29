package com.pmj.accounts;

import com.pmj.accounts.dto.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.pmj.accounts.controller") })
@EnableJpaRepositories("com.pmj.accounts.repository")
@EntityScan("com.pmj.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Account microservices REST API Documentation",
				description = "PMJ Account microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Pramitha Jayasooriya",
						email = "lpramithamj@gmail.com",
						url = "https://github.com/PramithaMJ"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/PramithaMJ"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "PMJ Account microservice REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.html#/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
