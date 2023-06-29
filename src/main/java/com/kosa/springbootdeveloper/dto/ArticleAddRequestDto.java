package com.kosa.springbootdeveloper.dto;

import com.kosa.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 인자 없는 생성자
@AllArgsConstructor // title과 content를 모두 받을 수 있게
@Getter // 각각의 값을 받을 수 있게

public class ArticleAddRequestDto {
    private String title;
    private String content;

    public Article toEntity() { // 생성자를 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
