package com.fibers.demo.spring.repository;

import com.fibers.demo.spring.model.Spitter;
import org.springframework.stereotype.Component;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }
}
