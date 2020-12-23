package uk.co.leafdevelopment.adwords.configuration;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.auth.oauth2.UserCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
public class AdwordsConfiguration {

    @Bean
    public GoogleAdsClient googleAdsClient() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("ads.properties");
        return GoogleAdsClient.newBuilder().fromPropertiesFile(classPathResource.getFile()).build();
    }

}
