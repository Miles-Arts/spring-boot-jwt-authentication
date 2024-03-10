package com.websecurity.demo.jwt.Jwt;

import com.websecurity.demo.jwt.User.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class JwtService {
    public String getToken(UserDetails user) {
        return getToken(new HashMap<>(), user);
    }

    private <V, K> String getToken(HashMap<K,V> kvHashMap, UserDetails user) {
    }
}
