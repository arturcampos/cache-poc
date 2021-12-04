package com.cache.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.nio.charset.StandardCharsets;

public class NotFoundException extends HttpClientErrorException {

    public NotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }

    public NotFoundException(String text) {
        super(HttpStatus.NOT_FOUND, text);
    }

    public NotFoundException(String text, String message) {
        super(HttpStatus.NOT_FOUND, text, message.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);

    }
}
