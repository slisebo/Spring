package ru.otus.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.retry.annotation.EnableRetry;
import ru.otus.spring.dto.Country;
import ru.otus.spring.service.CountryService;

import java.util.List;

@EnableCaching
@EnableRetry
@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        CountryService service = ctx.getBean(CountryService.class);

        Country country = service.getCountry("col");

        log.info(country.getName());

        country = service.getCountry("col");

        log.info(country.getName());

        country = service.getCountry("ru");

        log.info(country.getName());

        country = service.getCountry("col");

        log.info(country.getName());

        country = service.getCountry("ru");

        log.info(country.getName());

        service.getCountries();

        country = service.getCountry("col");

        log.info(country.getName());

    }
}
