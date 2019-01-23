package com.fibers.demo.spring.repository;

import com.fibers.demo.spring.pojo.model.Spitter;

public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
