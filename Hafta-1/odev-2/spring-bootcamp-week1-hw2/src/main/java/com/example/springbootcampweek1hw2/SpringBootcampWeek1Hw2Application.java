package com.example.springbootcampweek1hw2;

import com.example.springbootcampweek1hw2.article.Article;
import com.example.springbootcampweek1hw2.collectionpipeline.CollectionPipelineMethods;
import com.example.springbootcampweek1hw2.utils.ArticleCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootcampWeek1Hw2Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootcampWeek1Hw2Application.class, args);

		final List<Article> articleList = ArticleCollector.collectArticles();

		articleList.forEach(article -> System.out.println(article.getTitle()));

		final List<Object> mappedArticleList = CollectionPipelineMethods.mapSample(
				articleList,
				article -> {
					article.setTitle("Title");
					return article;
				});

		articleList.forEach(article -> System.out.println(article.getTitle()));
	}

}
