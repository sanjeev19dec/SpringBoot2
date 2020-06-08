package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ch.qos.logback.core.net.ObjectWriter;

@Configuration
@EnableWebFlux
public class ApiConfig {

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
		
		return om;
		
	}
	
	@Bean
	public ObjectWriter objectWriter(ObjectMapper om) {
		
		return (ObjectWriter) om.writerWithDefaultPrettyPrinter();		
	}
}
