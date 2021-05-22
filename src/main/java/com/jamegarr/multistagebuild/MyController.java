package com.jamegarr.multistagebuild;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/controllergetmapping")
    public @ResponseBody ResponseEntity<String> test() {
        return new ResponseEntity<String>("GET Response controllergetmapping", HttpStatus.OK);
    }
}
