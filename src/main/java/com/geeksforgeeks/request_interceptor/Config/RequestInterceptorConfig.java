package com.geeksforgeeks.request_interceptor.Config;

import com.geeksforgeeks.request_interceptor.RequestInterceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(@NonNull InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor());
    }
}
