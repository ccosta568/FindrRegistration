package org.com.webConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
/*
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS for all endpoints
        registry.addMapping("/**")  // Allow CORS for all paths
                .allowedOrigins("https://getfindr.com", "https://www.getfindr.com")
             //   .allowedOrigins("http://localhost:4200") // Allow frontend to access backend (Angular on port 4200)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
                .allowedHeaders("*") // Allow all headers
                .exposedHeaders("Authorization")
                .allowCredentials(true) // Allow credentials (cookies, authorization headers, etc.)
                .maxAge(3600);
    }
 */
}
