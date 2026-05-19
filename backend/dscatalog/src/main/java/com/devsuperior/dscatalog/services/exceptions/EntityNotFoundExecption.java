package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundExecption extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public EntityNotFoundExecption(String message) {
        super(message);
    }
}
