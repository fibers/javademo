package com.fibers.demo.spring.repository;

import com.fibers.demo.spring.pojo.model.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);
}
