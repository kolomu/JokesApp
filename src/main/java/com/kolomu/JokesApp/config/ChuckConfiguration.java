package com.kolomu.JokesApp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is in same package as JokesApplication therefore it will be picked up by spring as component.
 * Important to tell spring that the configuration class is returning a bean!
 * Refactored the implementation to the configuration which gets injected via DI.
 *
 * Good use case when dealing with external JARs. (where you don't control the source code)
 * */
// @Configuration
public class ChuckConfiguration {

    // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
