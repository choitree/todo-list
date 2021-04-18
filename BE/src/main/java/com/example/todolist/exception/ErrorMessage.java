package com.example.todolist.exception;

public enum ErrorMessage {

    ENTITY_NOT_FOUND("해당 엔티티를 찾을 수 없습니다."),
    ENTITY_NOT_CREATE("해당 엔티티가 만들어지지 않았습니다."),
    ENTITY_NOT_CHANGE("해당 엔티티를 변경할 수 없습니다."),
    INVALID_USER("접근 권한이 없는 유저입니다."),
    DUPLICATED_ID("이미 사용중인 아이디입니다."),
    LOGIN_FAILED("아이디 또는 비밀번호가 틀립니다. 다시 로그인 해주세요.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
