package app.springframework.joke.sfjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConriguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){

        return  new ChuckNorrisQuotes();

    }
}
