package at.fhtechnikum.rectangle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/api/centimeter?inch={inch}")
    public double convert_inch(@PathVariable double inch){
        return inch * 2.54;
    }

    @GetMapping("/api/meter?yard={centimeter}")
    public double convert_centimeter(@PathVariable double centimeter){
        return centimeter * 0.9144;
    }
}
