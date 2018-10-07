package com.phonebook.dvoretskyi.phonebook.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  /**
   * Object mapper object mapper.
   *
   * @return the object mapper
   */
  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

}
