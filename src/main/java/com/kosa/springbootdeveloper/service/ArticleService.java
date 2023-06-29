package com.kosa.springbootdeveloper.service;

import com.kosa.springbootdeveloper.domain.Article;
import com.kosa.springbootdeveloper.dto.ArticleAddRequestDto;
import com.kosa.springbootdeveloper.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // 필드의 한정자에 final이 붙거나 @NotNUll이 붙은 필드의 생성자 추가
@Service    // 빈으로 등록
public class ArticleService {
    private final ArticleRepository articleRepository;

    // 블로그 글 추가 메서드
    public Article save(ArticleAddRequestDto dto) {
        return articleRepository.save(dto.toEntity());
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
