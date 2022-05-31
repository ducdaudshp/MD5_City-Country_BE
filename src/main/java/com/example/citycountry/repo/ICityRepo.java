package com.example.citycountry.repo;

import com.example.citycountry.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepo extends CrudRepository<City, Long> {
}
