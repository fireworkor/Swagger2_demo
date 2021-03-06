package com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *  作者  :   fireworkor  3159553637@qq.com
 *  时间  :   2018/5/19/0019  14:02
 *  描述  :   
 *
 */
@Configuration
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后台接口文档")
                .description("作者：fireworkor " +
                            " 有问题请联系3159553637@qq.com")
                .termsOfServiceUrl("")
//                .contact(new Contact("fireworkor",null,"3159553637@qq.com"))
                .version("1.0")
                .build();
    }
}