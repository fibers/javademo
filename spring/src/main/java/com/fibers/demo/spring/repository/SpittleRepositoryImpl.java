package com.fibers.demo.spring.repository;

import com.fibers.demo.spring.pojo.model.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + (max - i), new Date()));
        }
        return spittles;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle("Spittle " + id, new Date());
    }


}
