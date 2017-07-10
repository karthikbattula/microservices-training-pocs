package com.centrica.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollprocessingTask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner{

		@Override
		public void run(String... args) throws Exception {
			if(null != args) {
				System.out.println("parameters length: "+ args.length);
				
				String stationId = "station123";
				stationId = args[0];
				String licensePlate = args[1];
				String timestamp = args[2];
				
				System.out.println("Station Id: "+stationId+" licenseplate: "+licensePlate+" timeStamp: "+timestamp);
			}
		}
		
	}
}
