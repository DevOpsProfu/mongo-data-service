package mx.com.profuturo.mongodataservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDataServiceApplication {
	private static final Logger logger = LogManager.getLogger(MongoDataServiceApplication.class);

	public static void main(String[] args) {
		logger.debug("Inicio app");
		SpringApplication.run(MongoDataServiceApplication.class, args);
	}

}
