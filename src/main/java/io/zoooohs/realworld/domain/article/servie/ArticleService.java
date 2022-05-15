package io.zoooohs.realworld.domain.article.servie;

import io.zoooohs.realworld.domain.article.dto.ArticleDto;
import io.zoooohs.realworld.domain.user.dto.UserDto;

import java.util.List;

public interface ArticleService {
    ArticleDto createArticle(final ArticleDto article, final UserDto.Auth authUser);

    ArticleDto getArticle(final String slug, final UserDto.Auth authUser);

    ArticleDto updateArticle(final String slug, final ArticleDto.Update article, final UserDto.Auth authUser);

    void deleteArticle(final String slug, final UserDto.Auth authUser);

    List<ArticleDto> feedArticles(final UserDto.Auth authUser);
}
