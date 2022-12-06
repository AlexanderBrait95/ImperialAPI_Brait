package at.fhtechnikum.rectangle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/api/centimeter/{inch}")
    public String convert_inch(@PathVariable double inch){
        return String.valueOf(inch * 2.54);
    }

    @GetMapping("/api/meter/{meter}")
    public String convert_meter(@PathVariable double meter){
        return String.valueOf(meter * 0.9144);
    }
}
