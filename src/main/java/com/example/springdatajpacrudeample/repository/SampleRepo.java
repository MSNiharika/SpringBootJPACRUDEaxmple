package com.example.springdatajpacrudeample.repository;

import com.example.springdatajpacrudeample.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepo extends JpaRepository<SampleEntity,Long> {

    //findByAll represents select * from Users where id="";
}
