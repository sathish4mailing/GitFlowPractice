package com.edureka.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletApiApplication {

	public WalletApiApplication() {
		System.out.println(getClass().getName());
	}
	public static void main(String[] args) {
		SpringApplication.run(WalletApiApplication.class, args);
	}
}


