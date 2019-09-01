package com.kishkan.epam.devteam.service;

import org.springframework.stereotype.Service;

@Service
public class StringCipher {
    public int getHash(String string) {
        return string.hashCode();
    }
}
