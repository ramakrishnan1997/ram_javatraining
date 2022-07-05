package com.training.practice;

import java.util.List;

public interface PracticeCrud<T> {
public T add(T t);
public List <T> findAll();
public List<T>findname(String bookname) ;
}
