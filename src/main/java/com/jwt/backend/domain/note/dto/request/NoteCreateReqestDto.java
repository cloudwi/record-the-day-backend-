package com.jwt.backend.domain.note.dto.request;

import com.jwt.backend.domain.note.entity.Note;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoteCreateReqestDto {
    @NotBlank(message = "제목은 필수 입력입니다.")
    private String title;
    @NotBlank(message = "내용은 필수 입력입니다.")
    private String content;
    @NotBlank(message = "색상코드는 필수 입력입니다.")
    private String importance;

    public Note toEntity() {
        return Note.builder()
                .title(this.title)
                .content(this.content)
                .importance(this.importance)
                .build();
    }
}
