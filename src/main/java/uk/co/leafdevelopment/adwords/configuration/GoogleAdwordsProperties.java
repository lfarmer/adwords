package uk.co.leafdevelopment.adwords.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "google.ads")
public class GoogleAdwordsProperties {

    private String refreshToken;
    private String clientId;
    private String developerToken;
    private String clientSecret;
    private String loginCustomerId;

}
