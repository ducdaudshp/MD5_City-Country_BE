package com.example.citycountry.service.city;

import com.example.citycountry.model.City;
import com.example.citycountry.repo.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService{

    @Autowired
    ICityRepo cityRepo;

    @Override
    public Iterable<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepo.findById(id);
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepo.deleteById(id);
    }
}
