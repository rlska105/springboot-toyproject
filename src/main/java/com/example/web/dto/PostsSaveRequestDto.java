package com.example.web.dto;


import com.example.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String name;
    private String content;


    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .name(name)
                .content(content)
                .build();

    }
}
