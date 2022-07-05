package com.training.intface;

import java.util.List;

public interface CustomerRepository<T> {
public T add(T t);
public List<T> duetime();
public List<T> customername(String customername);
public List<T> findbyamount(int amount);
public List<T> findAll();
}
