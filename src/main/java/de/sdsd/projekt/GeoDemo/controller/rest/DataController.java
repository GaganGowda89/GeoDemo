package de.sdsd.projekt.GeoDemo.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ws/data")
public class DataController {

    @GetMapping("/all")
    public List<String> getAll() {
        List<String> data = new ArrayList<>();
        data.add("S1");
        data.add("S2");
        data.add("S3");
        data.add("S4");
        return data;
    }
}
