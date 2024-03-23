package com.michael.employee.exception;

public class UserNotFoundExecption extends RuntimeException {
    public UserNotFoundExecption(String msg) {
        super(msg);
    }
}
