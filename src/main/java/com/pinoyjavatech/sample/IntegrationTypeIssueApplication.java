package com.pinoyjavatech.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class IntegrationTypeIssueApplication implements ApplicationRunner{
	
	@Autowired
	PrinterService printerService;

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTypeIssueApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//printerService.print(Integer.valueOf(100));
		//printerService.print(Long.MAX_VALUE);
		printerService.print("TEST");
	}

}
