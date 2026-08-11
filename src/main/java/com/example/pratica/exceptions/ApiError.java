package com.example.pratica.exceptions;

import org.springframework.http.HttpStatus;

import java.time.Instant;

public record ApiError(Instant timeStamp, String message, HttpStatus statusCode, String details) {
}
