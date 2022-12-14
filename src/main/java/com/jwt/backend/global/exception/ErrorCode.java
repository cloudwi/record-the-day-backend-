package com.jwt.backend.global.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@AllArgsConstructor
public enum ErrorCode {

    /* 400 BAD_REQUEST : 잘못된 요청 */
    /* 401 UNAUTHORIZED : 인증되지 않은 사용자 */
    INVALID_AUTH_TOKEN(HttpStatus.UNAUTHORIZED, "잘못된 토큰입니다."),
    NOT_FOUND_AUTH_TOKEN(HttpStatus.NOT_FOUND, "토큰이 없습니다."),
    BAD_REQUEST_VALIDATION(HttpStatus.BAD_REQUEST, "검증에 실패하였습니다."),


    /* 404 NOT_FOUND : Resource를 찾을 수 없음 */
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
    NOTE_NOT_FOUND(HttpStatus.NOT_EXTENDED, "노트를 찾을 수 없습니다."),
    TODO_NOT_FOUND(HttpStatus.NOT_FOUND, "TODO를 찾을 수 없습니다."),
    PASSWORD_DIFFERENT(HttpStatus.NOT_FOUND, "잘못된 비밀번호 입니다."),
    /* 409 : CONFLICT : Resource의 현재 상태와 충돌. 보통 중복된 데이터 존재 */
    DUPLICATE_RESOURCE(HttpStatus.CONFLICT, "데이터가 이미 존재합니다."),
    EMAIL_DUPLICATE(HttpStatus.CONFLICT, "이메일이 중복 됩니다."),
    ;

    private final HttpStatus httpStatus;

    private final String message;
}