package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CalculatorService;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return calculatorService.divide(a, b);
    }
    
    
    
    
    
    
    
    
    
    /*
    5. Test Your Endpoints
    You can test your endpoints using a web browser or tools like Postman:

    Addition: http://localhost:8080/add?a=5&b=3
    Subtraction: http://localhost:8080/subtract?a=5&b=3
    Multiplication: http://localhost:8080/multiply?a=5&b=3
    Division: http://localhost:8080/divide?a=5&b=3
    
    
    */
}
