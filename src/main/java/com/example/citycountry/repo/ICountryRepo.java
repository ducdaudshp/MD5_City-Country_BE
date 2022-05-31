package com.example.citycountry.repo;

import com.example.citycountry.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepo extends CrudRepository<Country, Long> {
}
