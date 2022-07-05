package com.example.demo.model;

import java.util.List;

public interface CrudRepository<T> {
public T add(T t);
public List<T> findAll();
public T removebyId(int id);
public T update(T t);
public T findById(int id);

public T remove(T t);

}
