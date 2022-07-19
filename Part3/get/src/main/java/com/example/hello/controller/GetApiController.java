package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")    // http://localhost:8080/api/get/hello
    public String Hello() {
        return "hello";
    }

    @RequestMapping(path = "/hi",
            method = RequestMethod.GET)   // http://localhost:8080/api/get/hi
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}")    // http://localhost:8080/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(value = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    @GetMapping("/query-param")
    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry);
            sb.append(entry).append('\n');
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest) {

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
