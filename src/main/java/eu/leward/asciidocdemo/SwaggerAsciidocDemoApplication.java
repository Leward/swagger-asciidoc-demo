package eu.leward.asciidocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.not;

@SpringBootApplication
@EnableSwagger2
public class SwaggerAsciidocDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAsciidocDemoApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
					.build()
				.useDefaultResponseMessages(false);
	}

}
