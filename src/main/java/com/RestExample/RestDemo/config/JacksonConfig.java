package com.RestExample.RestDemo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonConfig {
	 public ObjectMapper objectMapper() {
	        ObjectMapper objectMapper = new ObjectMapper();

	        // Disable FAIL_ON_EMPTY_BEANS
	        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

	        // You can add more configuration if needed

	        return objectMapper;

}
}
