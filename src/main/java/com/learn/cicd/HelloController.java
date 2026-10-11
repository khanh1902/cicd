package com.learn.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok(helloService.hello());
    }
}
