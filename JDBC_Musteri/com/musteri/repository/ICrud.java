package com.musteri.repository;

import java.util.List;

public interface ICrud<T> {
	public void save(T t);

	public void update(T t);

	public void delete(int id);

	List<T> findAll();

	T findById(int id);

	List<T> findByColumnValue(String columnName, Object value);
}
