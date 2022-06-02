package br.com.edsongustavotofolo.examplespringbootcache.person;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static br.com.edsongustavotofolo.examplespringbootcache.config.CacheConfig.CACHE_GET_PERSONS;

@Service
public class PersonService {

    @Cacheable(CACHE_GET_PERSONS)
    public String getNames() {
        return "Edson, Yrla, Luiza, Lorena, Levi";
    }
}
