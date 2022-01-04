package com.example.springbootcampweek1hw2.collectionpipeline;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionPipelineMethods {

    public static <T, R> List<R> mapSample(List<T> list, Function<? super T, ? extends R> mapper) {
        return list.stream().map(mapper).collect(Collectors.toList());
    }
}
