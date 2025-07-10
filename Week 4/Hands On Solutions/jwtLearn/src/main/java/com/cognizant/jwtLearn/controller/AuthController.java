package com.cognizant.jwtLearn.controller;

import com.cognizant.jwtLearn.dto.AuthRequest;
import com.cognizant.jwtLearn.dto.AuthResponse;
import com.cognizant.jwtLearn.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthController {


    private final JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest request) {
        // Hardcoded user validation for now
        if ("admin".equalsIgnoreCase(request.getUsername()) && "password".equals(request.getPassword())) {
            String token = jwtUtil.generateToken(request.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        } else {
            return ResponseEntity.status(401).build();
        }
    }
}