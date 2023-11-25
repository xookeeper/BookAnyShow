package com.bookanyshow.controller.v1;


import com.bookanyshow.dtos.CreateCityDTO;
import com.bookanyshow.model.City;
import com.bookanyshow.service.cityservice.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cities")
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<City> getCities() {
        return cityService.getCities();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public City addCity(@RequestBody CreateCityDTO cityRequest){
        return cityService.addCity(cityRequest);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public City updateCity(@RequestParam Long cityId) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public City deleteCity(@RequestParam Long cityId) {
        return null;
    }

}
