package com.taining.intface;

public interface TravelRepository<T> {
	
	public T add(T t);
	public T findbyname(String username);

}
