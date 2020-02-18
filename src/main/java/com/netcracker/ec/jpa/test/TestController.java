package com.netcracker.ec.jpa.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity test() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
