package com.example.springbootcampweek1hw2.article;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Article {
    private String title;
    private Integer words;
    private List<String> tags;
    private String type;
}
