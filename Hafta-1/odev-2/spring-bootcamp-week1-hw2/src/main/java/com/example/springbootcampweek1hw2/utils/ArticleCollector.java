package com.example.springbootcampweek1hw2.utils;

import com.example.springbootcampweek1hw2.article.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleCollector {

    public static List<Article> collectArticles() {

        Article article1 = new Article("NoDBA", 561, Stream.of("nosql", "people", "orm").collect(Collectors.toList()), ":bliki");
        Article article2 = new Article("Infodeck", 1145, Stream.of("nosql", "writing").collect(Collectors.toList()), ":bliki");
        Article article3 = new Article("OrmHate", 1718, Stream.of("nosql", "orm").collect(Collectors.toList()), ":article");
        Article article4 = new Article("DDD_Aggregate", 482, Stream.of("nosql", "ddd").collect(Collectors.toList()), ":bliki");

        return Stream.of(article1, article2, article3, article4).collect(Collectors.toList());
    }
}
