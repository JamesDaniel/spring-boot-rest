package com.jamegarr.multistagebuild;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @RequestMapping(path = "/restcontrollerget", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> test() {
        return new ResponseEntity<String>("GET Response restcontrollerget", HttpStatus.OK);
    }
}
