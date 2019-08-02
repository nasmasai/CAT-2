package com.practicalcat.demo;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Unit>> response = restTemplate.exchange("http://http://10.51.10.111:1000/units/", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Unit>>() {
                });
        List<Unit> units = response.getBody();
        for (Unit unit:units){
            System.out.println(unit.toString());
        }

        System.out.println("Find One");
        Unit unit = restTemplate.getForObject("http://http://10.51.10.111:1000/units/1", Unit.class);
        System.out.println(unit.toString());

        Student newStudent = new Student("Nashon Masai Munyao", 075063);
        Student createStudent = restTemplate.postForObject("http://http://10.51.10.111:1000/registrations",newStudent,Student.class);

        System.out.println(createStudent.toString());

            }
}
