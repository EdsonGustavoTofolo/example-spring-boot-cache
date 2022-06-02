package br.com.edsongustavotofolo.examplespringbootcache.car;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static br.com.edsongustavotofolo.examplespringbootcache.config.CacheConfig.CACHE_GET_CARS;

@Service
public class CarService {

    @Cacheable(CACHE_GET_CARS)
    public String getBrands() {
        return "Volvo, BMW, Mercedes Benz";
    }
}
