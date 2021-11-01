package com.zuyfun.main.Service;

import java.util.Collection;

import com.zuyfun.main.Model.Item;

public interface ShoppingCartService {
	void add(Integer id, Item entity);
	void remove(Integer id);
	void update(Integer id, int qty);
	void clear();
	Collection<Item> getItems();
	int getCount();
	double getAmount();
}
