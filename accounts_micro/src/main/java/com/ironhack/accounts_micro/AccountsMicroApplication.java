package com.ironhack.accounts_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AccountsMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsMicroApplication.class, args);
	}

}
