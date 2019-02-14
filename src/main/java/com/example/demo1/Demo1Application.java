package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.example.demo1.dao")
@ImportResource(locations={"classpath:mykaptcha.xml"})
@EnableScheduling
@SpringBootApplication
//@EnableApolloConfig
public class Demo1Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

//	@Configuration
//	@EnableApolloConfig
//	public class AppConfig {
//		@Bean
//		public SampleRedisConfig sampleRedisConfig() {
//			return new SampleRedisConfig();
//		}
//	}
}
