package br.com.edsongustavotofolo.examplespringbootcache.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.management.timer.Timer;

@Configuration
@EnableCaching
@EnableScheduling
@Slf4j
public class CacheConfig {

    public static final String CACHE_GET_PERSONS = "cacheGetPersons";
    public static final String CACHE_GET_CARS = "cacheGetCars";

    private static final long CACHE_TIMER_5_MINUTES = Timer.ONE_MINUTE * 2;

    @Scheduled(fixedRate = CACHE_TIMER_5_MINUTES)
    @CacheEvict(value = {
            CACHE_GET_PERSONS,
            CACHE_GET_CARS
    }, allEntries = true)
    public void clearCache24horas() {
        log.info("Cleaning cache...");
    }
}
