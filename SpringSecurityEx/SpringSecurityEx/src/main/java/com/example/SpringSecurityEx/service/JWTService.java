package com.example.SpringSecurityEx.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JWTService {

    private String secretKey ="123a2c1f";

    public String generateToken(String userName) {

        Map<String, Object> claims= new HashMap<>();

        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(userName)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() * 60* 60* 30))
                .and()
                .signWith(getKey())
                .compact();

    }

    private Key getKey() {
        byte[] KeyByte = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(KeyByte);
    }


}
