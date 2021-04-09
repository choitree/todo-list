package com.example.todolist.exception;

public class EntityNotCreateException extends RuntimeException {
    public EntityNotCreateException() {
        super(ErrorMessage.ENTITY_NOT_CREATE.getErrorMessage());
    }
}
