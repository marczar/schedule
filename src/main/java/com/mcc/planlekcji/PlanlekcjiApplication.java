package com.mcc.planlekcji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class PlanlekcjiApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PlanlekcjiApplication.class, args);

	}

}
