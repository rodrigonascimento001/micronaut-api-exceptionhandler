package br.com.rodrigo.micronaut.exception;


import java.io.Serializable;


public class CustomException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
}
