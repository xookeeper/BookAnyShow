package com.bookanyshow.service.cityservice;

import com.bookanyshow.dtos.CreateCityDTO;
import com.bookanyshow.dtos.CreateScreenDTO;
import com.bookanyshow.model.City;
import com.bookanyshow.repository.CityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public City addCity(CreateCityDTO cityDTO){
        City city = City.builder().name(cityDTO.getName())
                                  .state(cityDTO.getState())
                                  .country(cityDTO.getCountry())
                                  .build();
        cityRepository.save(city);
        return city;
    }

    public List<City> getCities() {
        return (List<City>) cityRepository.findAll();
    }


}
