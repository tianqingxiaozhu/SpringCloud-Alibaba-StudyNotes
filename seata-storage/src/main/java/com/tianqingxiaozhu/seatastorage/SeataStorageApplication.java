package com.tianqingxiaozhu.seatastorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SeataStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataStorageApplication.class, args);
	}

}
