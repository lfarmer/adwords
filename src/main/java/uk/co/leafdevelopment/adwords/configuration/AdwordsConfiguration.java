package uk.co.leafdevelopment.adwords.configuration;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.auth.oauth2.UserCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdwordsConfiguration {

    @Bean
    public GoogleAdsClient googleAdsClient(GoogleAdwordsProperties googleAdwordsProperties) {
        return GoogleAdsClient.newBuilder()
                .setCredentials(UserCredentials.newBuilder()
                        .setClientId(googleAdwordsProperties.getClientId())
                        .setClientSecret(googleAdwordsProperties.getClientSecret())
                        .setRefreshToken(googleAdwordsProperties.getRefreshToken())
                        .build())
                .setDeveloperToken(googleAdwordsProperties.getDeveloperToken())
                .setLoginCustomerId(Long.parseLong(googleAdwordsProperties.getLoginCustomerId()))
                .build();
    }

}
