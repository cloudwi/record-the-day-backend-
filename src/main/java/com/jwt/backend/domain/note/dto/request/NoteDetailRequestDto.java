package com.jwt.backend.domain.note.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoteDetailRequestDto {
    @NotBlank(message = "아이디는 필수 입력입니다.")
    private Long id;
}
