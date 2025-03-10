package com.example.picpay.configuration;

import org.springframework.context.annotation.Bean;

import java.net.http.HttpClient;
import java.time.Duration;

public class HttpClientConfig {

    @Bean
    public HttpClient httpClient (){
        return HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }
}
