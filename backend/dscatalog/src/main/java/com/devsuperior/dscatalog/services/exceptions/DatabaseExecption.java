package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseExecption extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public DatabaseExecption(String message) {
        super(message);
    }
}
