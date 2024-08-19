package com.caramel.waffleshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication()
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class WaffleshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaffleshopApplication.class, args);
	}

}
