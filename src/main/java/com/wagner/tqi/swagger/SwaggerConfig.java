package com.wagner.tqi.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//
// Para ver o Swagger em execução: http://localhost:8080/swagger-ui.html
//
//
//

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wagner.tqi"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo(){
        return new ApiInfoBuilder()
                .title("Emprestimo API")
                .description("REST API para sistema de empréstimos e cadastro de pessoas com autenticação por meio de tokens JWT")
                .version("1.0.0")
                .contact(new Contact("Wagner Kaba", "https://github.com/wagnerkaba", "elguapore@gmail.com"))
                .build();

    }
}
