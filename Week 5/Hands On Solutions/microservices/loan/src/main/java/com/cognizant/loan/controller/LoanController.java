package com.cognizant.loan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public ResponseEntity<Map<String, Object>> getLoanByNumber(@PathVariable String number) {
        Map<String, Object> dummy = Map.of(
                "number", number,
                "type",   "car",
                "loan",   400000,
                "emi",    3258,
                "tenure", 18
        );
        return ResponseEntity.ok(dummy);
    }
}