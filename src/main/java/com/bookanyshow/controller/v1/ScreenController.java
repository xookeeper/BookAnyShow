package com.bookanyshow.controller.v1;

import com.bookanyshow.dtos.CreateScreenDTO;
import com.bookanyshow.model.Screen;
import com.bookanyshow.service.screenservice.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/screens")
public class ScreenController {

    @Autowired
    ScreenService screenService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Screen addScreen(@RequestBody CreateScreenDTO screenDTO){
        return screenService.addScree(screenDTO);
    }

}
