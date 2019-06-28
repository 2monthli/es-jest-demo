package com.extra.esboot.service;

import java.util.List;

import com.extra.esboot.entity.Entity;

public interface CityESService {

	void saveEntity(Entity entity);

	void saveEntity(List<Entity> entityList);

	List<Entity> searchEntity(String searchContent);
}