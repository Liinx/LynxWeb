package me.lynx.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LynxWeb extends SpringBootServletInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(LynxWeb.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LynxWeb.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(LynxWeb.class, args);


		LOGGER.info("App has been started.");
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}